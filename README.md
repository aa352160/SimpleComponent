# SimpleComponent
基于Fragment的超轻量级的组件化方案

由于公司的项目需要，经常会需要对几个现有功能进行组合来制作新的App，而对于之前所使用的单Module的架构方式来说，增减单个功能经常会影响到一些其它的模块，随后产生蝴蝶效应，不仅大大增加了修改成本，而且会使代码越来越混乱。为了解决这个问题，减少功能模块之间的耦合性，所以将眼光投向了组件化方案。

之前在网上也参考过一些开源的组件化框架，但是这些框架都显得太过于“重”了，不仅学习和使用成本比较高，而且对于项目的灵活性上也会有一定的影响，由此萌生了自己实现一个组件化方案的想法。

## 介绍

* 超轻量化： 没有任何第三方库的引入，代码量少
* 结构清晰： 原理简单，能够快速上手
* 兼容性好： 完全使用原生特性实现，理论上不会有兼容性问题

本方案主要着眼于项目中模块的解耦，暂时还无法实现单模块编译与单模块调试等功能。

## 项目结构

![项目结构.png](https://upload-images.jianshu.io/upload_images/2357398-ece50453f805d70f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 代码地址

[Github](https://github.com/aa352160/SimpleComponent)

本方案还很不完善，有许多的欠缺与不足，欢迎大家提出意见和建议！
