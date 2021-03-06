BASE_PATH=/bea/jenkinsrun/dockerfile
# 源jar路径
SOURCE_PATH=/var/lib/jenkins/workspace/istio
#容器id
CID=$(docker ps | grep "restfulmock" | awk '{print $1}')

DATE=`date +%Y%m%d%H%M`

# 最新构建代码 移动到项目环境
function transfer(){
    echo "最新构建代码 $SOURCE_PATH/target/restfulmock-0.0.1-snapshot.jar  迁移至 $BASE_PATH ...."
        sudo cp $SOURCE_PATH/target/restfulmock-0.0.1-snapshot.jar $BASE_PATH
        sudo cp $SOURCE_PATH/{Dockerfile,run.sh} $BASE_PATH
        sudo cp $SOURCE_PATH/target/classes/application.properties $BASE_PATH/conf/restmock
}
# 备份
function backup(){
	if [ -f "$BASE_PATH/restfulmock-0.0.1-snapshot.jar" ]; then
    	echo "restfulmock-0.0.1-SNAPSHOT.jar 备份..."
        	sudo cp $SOURCE_PATH/target/restfulmock-0.0.1-snapshot.jar $BASE_PATH/backup/restfulmock-$DATE.jar
			sleep 3
			sudo rm -rf $BASE_PATH/restfulmock-0.0.1-snapshot.jar
        echo "备份restfulmockr完成"
    else
    	echo "$BASE_PATH/restfulmock-0.0.1-SNAPSHOT.jar不存在，跳过备份"
    fi
}

# 构建docker镜像
function build(){
	echo "开始构建镜像..."
	cd $BASE_PATH
	sudo docker build -t restfulmock-0.0.1-snapshot:restfulmock .
}

# 运行docker容器
function run(){
	backup
	transfer
	build
	if [ -n "$CID" ]; then
		echo "存在demo容器，CID=$CID,重启docker容器 ..."
			sudo docker stop $CID
			sudo docker rm $CID
			#挂载-v 参数要放前面否则不生效
			sudo docker run -d -p 8082:8082 -v $BASE_PATH/conf/restmock:/restMock/conf restfulmock-0.0.1-snapshot:restfulmock
		echo "demo容器重启完成"
	else
		echo "不存在demo容器，docker run创建容器..."
			sudo docker run -d -p 8082:8082 -v $BASE_PATH/conf/restmock:/restMock/conf restfulmock-0.0.1-snapshot:restfulmock
		echo "demo容器创建完成"
	fi
}

#入口
run
