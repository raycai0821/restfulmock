BASE_PATH=/bea/jenkinsrun/dockerfile
# 源jar路径
SOURCE_PATH=/var/lib/jenkins/workspace/istio
#容器id
CID=$(docker ps | grep "restfulmock" | awk '{print $1}')

DATE=`date +%Y%m%d%H%M`

# 最新构建代码 移动到项目环境
function transfer(){
    echo "最新构建代码 $SOURCE_PATH/target/restfulmock-0.0.1-SNAPSHOT.jar  迁移至 $BASE_PATH ...."
        sudo cp $SOURCE_PATH/target/restfulmock-0.0.1-SNAPSHOT.jar $BASE_PATH
        sudo cp $SOURCE_PATH/{Dockerfile,run.sh} $BASE_PATH
}
# 备份
function backup(){
	if [ -f "$BASE_PATH/restfulmock-0.0.1-SNAPSHOT.jar" ]; then
    	echo "restfulmock-0.0.1-SNAPSHOT.jar 备份..."
        	sudo cp $BASE_PATH/restfulmock-0.0.1-SNAPSHOT.jar $BASE_PATH/backup/restfulmock-$DATE.jar
			sleep 3
			sudo rm -rf $BASE_PATH/restfulmock-0.0.1-SNAPSHOT.jar
        echo "备份restfulmockr完成"
    else
    	echo "$BASE_PATH/restfulmock-0.0.1-SNAPSHOT.jar不存在，跳过备份"
    fi
}

# 构建docker镜像
function build(){
	echo "开始构建镜像..."
	cd $BASE_PATH
	sudo docker build -t restfulmock-0.0.1-SNAPSHOT.jar:restfulmock .
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
			sudo docker run -d -p 8080:8081 restfulmock-0.0.1-SNAPSHOT.jar:restfulmock
		echo "demo容器重启完成"
	else
		echo "不存在demo容器，docker run创建容器..."
			sudo docker run -d -p 8080:8081 restfulmock-0.0.1-SNAPSHOT.jar:restfulmock
		echo "demo容器创建完成"
	fi
}

#入口
run
