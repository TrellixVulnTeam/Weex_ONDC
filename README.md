# Weex
----------
2017/6/5 9:07:13 Wjz整理 
----------

* 阿里的Weex很强大，但官方给文档太 *，只能看看，实际应用还需要另辟蹊径。
* 本笔记主要记录Weex与移动端混合开发的案例
## Weex 环境变量配置

* Weex官方提供的Weex镜像有问题！无法使用Weex命令。
	* 在segmentfault给出的解决方法：https://segmentfault.com/q/1010000009214258
		
			1.安装Node.js
				http://nodejs.cn/download/
				使用需要配置Path，如果系统无法授权可以使用.zip包，然后配置Path
			2.macOS 安装 weex-toolkit 会有权限问题
				weex 需要在 /User 目录里写文件
				使用命令行授权
				sudo chmod -R 777 /User/***			

* Weex 安装命令

		// 安装 weex-toolkit
		npm install -g weex-toolkit
		// 安装 weexpack
		npm install -g weexpack

		// 查看 weex-toolkit 是否安装成功
		weex
		// 查看 weexpack 是否安装成功
		weexpack

## Weex 创建新工程

	// 使用 weexpack 创建新工程
	weexpack create *

	为了让程序可以做到即使即用需要修改一些配置文件
	1. package.json 文件
	将
	"serve": "webpack-dev-server --config webpack.dev.js -p --open"
	改为
	"serve": "serve ./ -p 8080"

	在
	devDependencies
	添加
	"serve":"^1.4.0",

	2. start 文件
	将 
	npm run serve
	改为
	npm run build & npm run dev & npm run serve
	
	// 使用 npm 添加依赖
	npm install
	// 使用 npm 编译程序，将 .vue/.we 文件编译成 .js 如果在 start 中添加 可以不执行
	// npm run build
	// 添加 platform
	weexpack platform add android/ios/web
	// 启动项目
	./start

## Vue.js 推荐博客
* Vue.js项目
	* https://github.com/keepfool/vue-tutorials
* Vue.js博客
	* http://www.cnblogs.com/keepfool/category/845804.html
* ECMAScript 6 入门
	* http://es6.ruanyifeng.com/?search=import&x=0&y=0

## Weex 推荐博客
* Android
	http://ie8384.com/blog/?p=1452
	
* iOS
	https://segmentfault.com/a/1190000007997099
	
* Web
	https://segmentfault.com/a/1190000007844330
