// { "framework": "Weex"} 

!function(t){function e(o){if(n[o])return n[o].exports;var r=n[o]={i:o,l:!1,exports:{}};return t[o].call(r.exports,r,r.exports,e),r.l=!0,r.exports}var n={};e.m=t,e.c=n,e.i=function(t){return t},e.d=function(t,n,o){e.o(t,n)||Object.defineProperty(t,n,{configurable:!1,enumerable:!0,get:o})},e.n=function(t){var n=t&&t.__esModule?function(){return t.default}:function(){return t};return e.d(n,"a",n),n},e.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},e.p="",e(e.s=150)}([function(t,e,n){t.exports=!n(1)(function(){return 7!=Object.defineProperty({},"a",{get:function(){return 7}}).a})},function(t,e){t.exports=function(t){try{return!!t()}catch(t){return!0}}},function(t,e){var n=t.exports="undefined"!=typeof window&&window.Math==Math?window:"undefined"!=typeof self&&self.Math==Math?self:Function("return this")();"number"==typeof __g&&(__g=n)},function(t,e){t.exports=function(t){return"object"==typeof t?null!==t:"function"==typeof t}},function(t,e){var n=t.exports={version:"2.4.0"};"number"==typeof __e&&(__e=n)},function(t,e){t.exports=function(t){if(void 0==t)throw TypeError("Can't call method on  "+t);return t}},function(t,e,n){var o=n(17);t.exports=Object("z").propertyIsEnumerable(0)?Object:function(t){return"String"==o(t)?t.split(""):Object(t)}},function(t,e){var n=Math.ceil,o=Math.floor;t.exports=function(t){return isNaN(t=+t)?0:(t>0?o:n)(t)}},function(t,e,n){var o=n(6),r=n(5);t.exports=function(t){return o(r(t))}},function(t,e,n){var o=n(65),r=n(54),i=n(76);__weex_define__("@weex-component/wxc-navbar",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e,n){var o=n(69),r=n(58),i=n(80);__weex_define__("@weex-component/wxc-tabitem",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e,n){n(40),n(42),n(43),n(46),n(48),n(41),n(44),n(9),n(45),n(47),n(10)},function(t,e,n){t.exports={default:n(13),__esModule:!0}},function(t,e,n){n(39),t.exports=n(4).Object.assign},function(t,e){t.exports=function(t){if("function"!=typeof t)throw TypeError(t+" is not a function!");return t}},function(t,e,n){var o=n(3);t.exports=function(t){if(!o(t))throw TypeError(t+" is not an object!");return t}},function(t,e,n){var o=n(8),r=n(35),i=n(34);t.exports=function(t){return function(e,n,s){var c,a=o(e),u=r(a.length),l=i(s,u);if(t&&n!=n){for(;u>l;)if((c=a[l++])!=c)return!0}else for(;u>l;l++)if((t||l in a)&&a[l]===n)return t||l||0;return!t&&-1}}},function(t,e){var n={}.toString;t.exports=function(t){return n.call(t).slice(8,-1)}},function(t,e,n){var o=n(14);t.exports=function(t,e,n){if(o(t),void 0===e)return t;switch(n){case 1:return function(n){return t.call(e,n)};case 2:return function(n,o){return t.call(e,n,o)};case 3:return function(n,o,r){return t.call(e,n,o,r)}}return function(){return t.apply(e,arguments)}}},function(t,e,n){var o=n(3),r=n(2).document,i=o(r)&&o(r.createElement);t.exports=function(t){return i?r.createElement(t):{}}},function(t,e){t.exports="constructor,hasOwnProperty,isPrototypeOf,propertyIsEnumerable,toLocaleString,toString,valueOf".split(",")},function(t,e,n){var o=n(2),r=n(4),i=n(18),s=n(23),c=function(t,e,n){var a,u,l,f=t&c.F,d=t&c.G,p=t&c.S,h=t&c.P,g=t&c.B,m=t&c.W,x=d?r:r[e]||(r[e]={}),b=x.prototype,v=d?o:p?o[e]:(o[e]||{}).prototype;d&&(n=e);for(a in n)(u=!f&&v&&void 0!==v[a])&&a in x||(l=u?v[a]:n[a],x[a]=d&&"function"!=typeof v[a]?n[a]:g&&u?i(l,o):m&&v[a]==l?function(t){var e=function(e,n,o){if(this instanceof t){switch(arguments.length){case 0:return new t;case 1:return new t(e);case 2:return new t(e,n)}return new t(e,n,o)}return t.apply(this,arguments)};return e.prototype=t.prototype,e}(l):h&&"function"==typeof l?i(Function.call,l):l,h&&((x.virtual||(x.virtual={}))[a]=l,t&c.R&&b&&!b[a]&&s(b,a,l)))};c.F=1,c.G=2,c.S=4,c.P=8,c.B=16,c.W=32,c.U=64,c.R=128,t.exports=c},function(t,e){var n={}.hasOwnProperty;t.exports=function(t,e){return n.call(t,e)}},function(t,e,n){var o=n(26),r=n(31);t.exports=n(0)?function(t,e,n){return o.f(t,e,r(1,n))}:function(t,e,n){return t[e]=n,t}},function(t,e,n){t.exports=!n(0)&&!n(1)(function(){return 7!=Object.defineProperty(n(19)("div"),"a",{get:function(){return 7}}).a})},function(t,e,n){"use strict";var o=n(29),r=n(27),i=n(30),s=n(36),c=n(6),a=Object.assign;t.exports=!a||n(1)(function(){var t={},e={},n=Symbol(),o="abcdefghijklmnopqrst";return t[n]=7,o.split("").forEach(function(t){e[t]=t}),7!=a({},t)[n]||Object.keys(a({},e)).join("")!=o})?function(t,e){for(var n=s(t),a=arguments.length,u=1,l=r.f,f=i.f;a>u;)for(var d,p=c(arguments[u++]),h=l?o(p).concat(l(p)):o(p),g=h.length,m=0;g>m;)f.call(p,d=h[m++])&&(n[d]=p[d]);return n}:a},function(t,e,n){var o=n(15),r=n(24),i=n(37),s=Object.defineProperty;e.f=n(0)?Object.defineProperty:function(t,e,n){if(o(t),e=i(e,!0),o(n),r)try{return s(t,e,n)}catch(t){}if("get"in n||"set"in n)throw TypeError("Accessors not supported!");return"value"in n&&(t[e]=n.value),t}},function(t,e){e.f=Object.getOwnPropertySymbols},function(t,e,n){var o=n(22),r=n(8),i=n(16)(!1),s=n(32)("IE_PROTO");t.exports=function(t,e){var n,c=r(t),a=0,u=[];for(n in c)n!=s&&o(c,n)&&u.push(n);for(;e.length>a;)o(c,n=e[a++])&&(~i(u,n)||u.push(n));return u}},function(t,e,n){var o=n(28),r=n(20);t.exports=Object.keys||function(t){return o(t,r)}},function(t,e){e.f={}.propertyIsEnumerable},function(t,e){t.exports=function(t,e){return{enumerable:!(1&t),configurable:!(2&t),writable:!(4&t),value:e}}},function(t,e,n){var o=n(33)("keys"),r=n(38);t.exports=function(t){return o[t]||(o[t]=r(t))}},function(t,e,n){var o=n(2),r=o["__core-js_shared__"]||(o["__core-js_shared__"]={});t.exports=function(t){return r[t]||(r[t]={})}},function(t,e,n){var o=n(7),r=Math.max,i=Math.min;t.exports=function(t,e){return t=o(t),t<0?r(t+e,0):i(t,e)}},function(t,e,n){var o=n(7),r=Math.min;t.exports=function(t){return t>0?r(o(t),9007199254740991):0}},function(t,e,n){var o=n(5);t.exports=function(t){return Object(o(t))}},function(t,e,n){var o=n(3);t.exports=function(t,e){if(!o(t))return t;var n,r;if(e&&"function"==typeof(n=t.toString)&&!o(r=n.call(t)))return r;if("function"==typeof(n=t.valueOf)&&!o(r=n.call(t)))return r;if(!e&&"function"==typeof(n=t.toString)&&!o(r=n.call(t)))return r;throw TypeError("Can't convert object to primitive value")}},function(t,e){var n=0,o=Math.random();t.exports=function(t){return"Symbol(".concat(void 0===t?"":t,")_",(++n+o).toString(36))}},function(t,e,n){var o=n(21);o(o.S+o.F,"Object",{assign:n(25)})},function(t,e,n){var o=n(60),r=n(49),i=n(71);__weex_define__("@weex-component/wxc-button",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e,n){var o=n(61),r=n(50),i=n(72);__weex_define__("@weex-component/wxc-countdown",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e,n){var o=n(62),r=n(51),i=n(73);__weex_define__("@weex-component/wxc-hn",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e,n){var o=n(63),r=n(52),i=n(74);__weex_define__("@weex-component/wxc-list-item",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e,n){var o=n(64),r=n(53),i=n(75);__weex_define__("@weex-component/wxc-marquee",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e,n){n(9);var o=n(66),r=n(55),i=n(77);__weex_define__("@weex-component/wxc-navpage",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e,n){var o=n(67),r=n(56),i=n(78);__weex_define__("@weex-component/wxc-panel",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e,n){n(10);var o=n(68),r=n(57),i=n(79);__weex_define__("@weex-component/wxc-tabbar",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e,n){var o=n(70),r=n(59),i=n(81);__weex_define__("@weex-component/wxc-tip",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e){t.exports={btn:{marginBottom:0,alignItems:"center",justifyContent:"center",borderWidth:1,borderStyle:"solid",borderColor:"#333333"},"btn-default":{color:"rgb(51,51,51)"},"btn-primary":{backgroundColor:"rgb(40,96,144)",borderColor:"rgb(40,96,144)"},"btn-success":{backgroundColor:"rgb(92,184,92)",borderColor:"rgb(76,174,76)"},"btn-info":{backgroundColor:"rgb(91,192,222)",borderColor:"rgb(70,184,218)"},"btn-warning":{backgroundColor:"rgb(240,173,78)",borderColor:"rgb(238,162,54)"},"btn-danger":{backgroundColor:"rgb(217,83,79)",borderColor:"rgb(212,63,58)"},"btn-link":{borderColor:"rgba(0,0,0,0)",borderRadius:0},"btn-txt-default":{color:"rgb(51,51,51)"},"btn-txt-primary":{color:"rgb(255,255,255)"},"btn-txt-success":{color:"rgb(255,255,255)"},"btn-txt-info":{color:"rgb(255,255,255)"},"btn-txt-warning":{color:"rgb(255,255,255)"},"btn-txt-danger":{color:"rgb(255,255,255)"},"btn-txt-link":{color:"rgb(51,122,183)"},"btn-sz-large":{width:300,height:100,paddingTop:25,paddingBottom:25,paddingLeft:40,paddingRight:40,borderRadius:15},"btn-sz-middle":{width:240,height:80,paddingTop:15,paddingBottom:15,paddingLeft:30,paddingRight:30,borderRadius:10},"btn-sz-small":{width:170,height:60,paddingTop:12,paddingBottom:12,paddingLeft:25,paddingRight:25,borderRadius:7},"btn-txt-sz-large":{fontSize:45},"btn-txt-sz-middle":{fontSize:35},"btn-txt-sz-small":{fontSize:30}}},function(t,e){t.exports={wrap:{overflow:"hidden"}}},function(t,e){t.exports={h1:{height:110,paddingTop:20,paddingBottom:20},h2:{height:110,paddingTop:20,paddingBottom:20},h3:{height:110,paddingTop:20,paddingBottom:20},"txt-h1":{fontSize:70},"txt-h2":{fontSize:52},"txt-h3":{fontSize:42}}},function(t,e){t.exports={item:{paddingTop:25,paddingBottom:25,paddingLeft:35,paddingRight:35,height:160,justifyContent:"center",borderBottomWidth:1,borderColor:"#dddddd"}}},function(t,e){t.exports={wrap:{overflow:"hidden",position:"relative"},anim:{flexDirection:"column",position:"absolute",transform:"translateY(0) translateZ(0)"}}},function(t,e){t.exports={container:{flexDirection:"row",position:"fixed",top:0,left:0,right:0,width:750},"right-text":{position:"absolute",bottom:28,right:32,textAlign:"right",fontSize:32,fontFamily:"'Open Sans', sans-serif"},"left-text":{position:"absolute",bottom:28,left:32,textAlign:"left",fontSize:32,fontFamily:"'Open Sans', sans-serif"},"center-text":{position:"absolute",bottom:25,left:172,right:172,textAlign:"center",fontSize:36,fontWeight:"bold"},"left-image":{position:"absolute",bottom:20,left:28,width:50,height:50},"right-image":{position:"absolute",bottom:20,right:28,width:50,height:50}}},function(t,e){t.exports={wrapper:{position:"absolute",top:0,left:0,right:0,bottom:0,width:750}}},function(t,e){t.exports={panel:{marginBottom:20,backgroundColor:"#ffffff",borderColor:"#dddddd",borderWidth:1},"panel-primary":{borderColor:"rgb(40,96,144)"},"panel-success":{borderColor:"rgb(76,174,76)"},"panel-info":{borderColor:"rgb(70,184,218)"},"panel-warning":{borderColor:"rgb(238,162,54)"},"panel-danger":{borderColor:"rgb(212,63,58)"},"panel-header":{backgroundColor:"#f5f5f5",fontSize:40,color:"#333333"},"panel-header-primary":{backgroundColor:"rgb(40,96,144)",color:"#ffffff"},"panel-header-success":{backgroundColor:"rgb(92,184,92)",color:"#ffffff"},"panel-header-info":{backgroundColor:"rgb(91,192,222)",color:"#ffffff"},"panel-header-warning":{backgroundColor:"rgb(240,173,78)",color:"#ffffff"},"panel-header-danger":{backgroundColor:"rgb(217,83,79)",color:"#ffffff"}}},function(t,e){t.exports={wrapper:{width:750,position:"absolute",top:0,left:0,right:0,bottom:0},content:{position:"absolute",top:0,left:0,right:0,bottom:0,marginTop:0,marginBottom:88},tabbar:{flexDirection:"row",position:"fixed",bottom:0,left:0,right:0,height:88}}},function(t,e){t.exports={container:{flex:1,flexDirection:"column",alignItems:"center",justifyContent:"center",height:88},"top-line":{position:"absolute",top:0,left:0,right:0,height:2},"tab-icon":{marginTop:5,width:40,height:40},"tab-text":{marginTop:5,textAlign:"center",fontSize:20}}},function(t,e){t.exports={tip:{paddingLeft:36,paddingRight:36,paddingTop:36,paddingBottom:36,borderRadius:10},"tip-txt":{fontSize:28},"tip-success":{backgroundColor:"#dff0d8",borderColor:"#d6e9c6"},"tip-txt-success":{color:"#3c763d"},"tip-info":{backgroundColor:"#d9edf7",borderColor:"#bce8f1"},"tip-txt-info":{color:"#31708f"},"tip-warning":{backgroundColor:"#fcf8e3",borderColor:"#faebcc"},"tip-txt-warning":{color:"#8a6d3b"},"tip-danger":{backgroundColor:"#f2dede",borderColor:"#ebccd1"},"tip-txt-danger":{color:"#a94442"}}},function(t,e){t.exports={type:"div",classList:function(){return["btn","btn-"+this.type,"btn-sz-"+this.size]},children:[{type:"text",classList:function(){return["btn-txt","btn-txt-"+this.type,"btn-txt-sz-"+this.size]},attr:{value:function(){return this.value}}}]}},function(t,e){t.exports={type:"div",style:{overflow:"hidden",flexDirection:"row"},events:{appear:"appeared",disappear:"disappeared"},children:[{type:"content"}]}},function(t,e){t.exports={type:"div",classList:function(){return["h"+this.level]},style:{justifyContent:"center"},children:[{type:"text",classList:function(){return["txt-h"+this.level]},attr:{value:function(){return this.value}}}]}},function(t,e){t.exports={type:"div",classList:["item"],events:{touchstart:"touchstart",touchend:"touchend"},style:{backgroundColor:function(){return this.bgColor}},children:[{type:"content"}]}},function(t,e){t.exports={type:"div",classList:["wrap"],events:{appear:"appeared",disappear:"disappeared"},children:[{type:"div",id:"anim",classList:["anim"],children:[{type:"content"}]}]}},function(t,e){t.exports={type:"div",classList:["container"],style:{height:function(){return this.height},backgroundColor:function(){return this.backgroundColor}},attr:{dataRole:function(){return this.dataRole}},children:[{type:"text",classList:["right-text"],style:{color:function(){return this.rightItemColor}},attr:{naviItemPosition:"right",value:function(){return this.rightItemTitle}},shown:function(){return!this.rightItemSrc},events:{click:"onclickrightitem"}},{type:"image",classList:["right-image"],attr:{naviItemPosition:"right",src:function(){return this.rightItemSrc}},shown:function(){return this.rightItemSrc},events:{click:"onclickrightitem"}},{type:"text",classList:["left-text"],style:{color:function(){return this.leftItemColor}},attr:{naviItemPosition:"left",value:function(){return this.leftItemTitle}},shown:function(){return!this.leftItemSrc},events:{click:"onclickleftitem"}},{type:"image",classList:["left-image"],attr:{naviItemPosition:"left",src:function(){return this.leftItemSrc}},shown:function(){return this.leftItemSrc},events:{click:"onclickleftitem"}},{type:"text",classList:["center-text"],style:{color:function(){return this.titleColor}},attr:{naviItemPosition:"center",value:function(){return this.title}}}]}},function(t,e){t.exports={type:"div",classList:["wrapper"],children:[{type:"wxc-navbar",attr:{dataRole:function(){return this.dataRole},height:function(){return this.height},backgroundColor:function(){return this.backgroundColor},title:function(){return this.title},titleColor:function(){return this.titleColor},leftItemSrc:function(){return this.leftItemSrc},leftItemTitle:function(){return this.leftItemTitle},leftItemColor:function(){return this.leftItemColor},rightItemSrc:function(){return this.rightItemSrc},rightItemTitle:function(){return this.rightItemTitle},rightItemColor:function(){return this.rightItemColor}}},{type:"div",classList:["wrapper"],style:{marginTop:function(){return this.height}},children:[{type:"content"}]}]}},function(t,e){t.exports={type:"div",classList:function(){return["panel","panel-"+this.type]},style:{borderWidth:function(){return this.border}},children:[{type:"text",classList:function(){return["panel-header","panel-header-"+this.type]},style:{paddingTop:function(){return this.paddingHead},paddingBottom:function(){return this.paddingHead},paddingLeft:function(){return 1.5*this.paddingHead},paddingRight:function(){return 1.5*this.paddingHead}},attr:{value:function(){return this.title}}},{type:"div",classList:function(){return["panel-body","panel-body-"+this.type]},style:{paddingTop:function(){return this.paddingBody},paddingBottom:function(){return this.paddingBody},paddingLeft:function(){return 1.5*this.paddingBody},paddingRight:function(){return 1.5*this.paddingBody}},children:[{type:"content"}]}]}},function(t,e){t.exports={type:"div",classList:["wrapper"],children:[{type:"embed",classList:["content"],style:{visibility:function(){return this.visibility}},repeat:function(){return this.tabItems},attr:{src:function(){return this.src},type:"weex"}},{type:"div",classList:["tabbar"],append:"tree",children:[{type:"wxc-tabitem",repeat:function(){return this.tabItems},attr:{index:function(){return this.index},icon:function(){return this.icon},title:function(){return this.title},titleColor:function(){return this.titleColor}}}]}]}},function(t,e){t.exports={type:"div",classList:["container"],style:{backgroundColor:function(){return this.backgroundColor}},events:{click:"onclickitem"},children:[{type:"image",classList:["top-line"],attr:{src:"http://gtms03.alicdn.com/tps/i3/TB1mdsiMpXXXXXpXXXXNw4JIXXX-640-4.png"}},{type:"image",classList:["tab-icon"],attr:{src:function(){return this.icon}}},{type:"text",classList:["tab-text"],style:{color:function(){return this.titleColor}},attr:{value:function(){return this.title}}}]}},function(t,e){t.exports={type:"div",classList:function(){return["tip","tip-"+this.type]},children:[{type:"text",classList:function(){return["tip-txt","tip-txt-"+this.type]},attr:{value:function(){return this.value}}}]}},function(t,e){t.exports=function(t,e,n){"use strict";t.exports={data:function(){return{type:"default",size:"large",value:""}},methods:{}}}},function(t,e,n){t.exports=function(t,e,o){"use strict";var r=n(12),i=function(t){return t&&t.__esModule?t:{default:t}}(r);t.exports={data:function(){return{now:0,remain:0,time:{elapse:0,D:"0",DD:"0",h:"0",hh:"00",H:"0",HH:"0",m:"0",mm:"00",M:"0",MM:"0",s:"0",ss:"00",S:"0",SS:"0"},outofview:!1}},ready:function(){this.remain<=0||(this.now=Date.now(),this.nextTick())},methods:{nextTick:function(){this.outofview?setTimeout(this.nextTick.bind(this),1e3):(this.time.elapse=parseInt((Date.now()-this.now)/1e3),this.calc()?(this.$emit("tick",(0,i.default)({},this.time)),setTimeout(this.nextTick.bind(this),1e3)):this.$emit("alarm",(0,i.default)({},this.time)),this._app.updateActions())},format:function(t){return t.length>=2?t:"0"+t},calc:function(){var t=this.remain-this.time.elapse;return t<0&&(t=0),this.time.D=String(parseInt(t/86400)),this.time.DD=this.format(this.time.D),this.time.h=String(parseInt((t-86400*parseInt(this.time.D))/3600)),this.time.hh=this.format(this.time.h),this.time.H=String(parseInt(t/3600)),this.time.HH=this.format(this.time.H),this.time.m=String(parseInt((t-3600*parseInt(this.time.H))/60)),this.time.mm=this.format(this.time.m),this.time.M=String(parseInt(t/60)),this.time.MM=this.format(this.time.M),this.time.s=String(t-60*parseInt(this.time.M)),this.time.ss=this.format(this.time.s),this.time.S=String(t),this.time.SS=this.format(this.time.S),t>0},appeared:function(){this.outofview=!1},disappeared:function(){this.outofview=!0}}}}},function(t,e){t.exports=function(t,e,n){"use strict";t.exports={data:function(){return{level:1,value:""}},methods:{}}}},function(t,e){t.exports=function(t,e,n){"use strict";t.exports={data:function(){return{bgColor:"#ffffff"}},methods:{touchstart:function(){},touchend:function(){}}}}},function(t,e){t.exports=function(t,e,n){"use strict";t.exports={data:function(){return{step:0,count:0,index:1,duration:0,interval:0,outofview:!1}},ready:function(){this.interval>0&&this.step>0&&this.duration>0&&this.nextTick()},methods:{nextTick:function(){var t=this;this.outofview?setTimeout(t.nextTick.bind(t),t.interval):setTimeout(function(){t.animation(t.nextTick.bind(t))},t.interval)},animation:function(t){var e=this,o=-e.step*e.index;n("@weex-module/animation").transition(this.$el("anim"),{styles:{transform:"translateY("+String(o)+"px) translateZ(0)"},timingFunction:"ease",duration:e.duration},function(){e.index=(e.index+1)%e.count,e.$emit("change",{index:e.index,count:e.count}),t&&t()})},appeared:function(){this.outofview=!1},disappeared:function(){this.outofview=!0}}}}},function(t,e){t.exports=function(t,e,n){"use strict";t.exports={data:function(){return{dataRole:"navbar",backgroundColor:"black",height:88,title:"",titleColor:"black",rightItemSrc:"",rightItemTitle:"",rightItemColor:"black",leftItemSrc:"",leftItemTitle:"",leftItemColor:"black"}},methods:{onclickrightitem:function(t){this.$dispatch("naviBar.rightItem.click",{})},onclickleftitem:function(t){this.$dispatch("naviBar.leftItem.click",{})}}}}},function(t,e){t.exports=function(t,e,n){"use strict";t.exports={data:function(){return{dataRole:"navbar",backgroundColor:"black",height:88,title:"",titleColor:"black",rightItemSrc:"",rightItemTitle:"",rightItemColor:"black",leftItemSrc:"",leftItemTitle:"",leftItemColor:"black"}}}}},function(t,e){t.exports=function(t,e,n){"use strict";t.exports={data:function(){return{type:"default",title:"",paddingBody:20,paddingHead:20,dataClass:"",border:0}},ready:function(){}}}},function(t,e){t.exports=function(t,e,n){"use strict";t.exports={data:function(){return{tabItems:[],selectedIndex:0,selectedColor:"#ff0000",unselectedColor:"#000000"}},created:function(){this.selected(this.selectedIndex),this.$on("tabItem.onClick",function(t){var e=t.detail;this.selectedIndex=e.index,this.selected(e.index);var n={index:e.index};this.$dispatch("tabBar.onClick",n)})},methods:{selected:function(t){for(var e=0;e<this.tabItems.length;e++){var n=this.tabItems[e];e==t?(n.icon=n.selectedImage,n.titleColor=this.selectedColor,n.visibility="visible"):(n.icon=n.image,n.titleColor=this.unselectedColor,n.visibility="hidden")}}}}}},function(t,e){t.exports=function(t,e,n){"use strict";t.exports={data:function(){return{index:0,title:"",titleColor:"#000000",icon:"",backgroundColor:"#ffffff"}},methods:{onclickitem:function(t){var e=this,n={index:e.index};e.$dispatch("tabItem.onClick",n)}}}}},function(t,e){t.exports=function(t,e,n){"use strict";t.exports={data:function(){return{type:"success",value:""}}}}},function(t,e,n){var o=n(84),r=n(83),i=n(85);__weex_define__("@weex-component/navbar",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},function(t,e){t.exports={nav_bar:{flexDirection:"row",height:100,backgroundColor:"#73D0F4"},nav_text:{fontWeight:"bold",justifyContent:"center",alignItems:"center"},nav_line:{height:1,backgroundColor:"#D8D8D8"}}},function(t,e){t.exports={type:"div",children:[{type:"div",classList:["nav_bar"],children:[{type:"div",style:{flex:1}},{type:"div",classList:["nav_text"],children:[{type:"text",style:{color:"#FFFFFF"},attr:{value:function(){return this.title}}}]},{type:"div",style:{flex:1}}]},{type:"div",classList:["nav_line"]}]}},function(t,e,n){t.exports=function(t,e,o){"use strict";n(11),t.exports={data:function(){return{title:""}}}}},function(t,e){t.exports={"col-wrapper":{width:750,padding:20,borderTopWidth:20,borderTopColor:"#EDEDED"}}},,,function(t,e){t.exports={type:"div",children:[{type:"div",classList:["col-wrapper"],attr:{obj:function(){return this.objectid}},events:{longpress:"longpress"},children:[{type:"text",classList:["col-content"],attr:{value:function(){return this.content}}},{type:"image",classList:["col-flag"],attr:{src:"http://p1.bpimg.com/1949/09b2df5158924ba4.png"},style:{position:"absolute",bottom:10,right:40,width:44,height:44}}]}]}},,,function(t,e,n){t.exports=function(t,e,o){"use strict";n(11);var r=o("@weex-module/modal"),i=o("@weex-module/stream");t.exports={data:function(){return{content:"",objectid:""}},methods:{longpress:function(t){var e=t.target.attr.obj,n="https://leancloud.cn:443/1.1/classes/collection/"+e;i.fetch({method:"DELETE",url:n,headers:{"X-LC-Id":"zksrg6fpR18GjAsv0eHPs4Kz-gzGzoHsz","X-LC-Key":"XfkYkvCvsJ1FkhEqzdTsMnNC","content-type":"application/json"}},function(t){t.ok?r.toast({message:"删除成功，刷新试试",duration:1}):r.toast({message:"删除失败",duration:1})})}}}}},,,function(t,e,n){var o=n(89),r=n(86),i=n(92);__weex_define__("@weex-component/col-item",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r})},,,,,,,,,,,,function(t,e){t.exports={"refresh-view":{height:100,width:750,alignItems:"center"},indicator:{width:60,height:60,color:"#889967"}}},,,,,,,,,,,,,,function(t,e){t.exports={type:"div",children:[{type:"navbar",attr:{title:"收藏"}},{type:"list",children:[{type:"refresh",classList:["refresh-view"],attr:{display:function(){return this.refresh_display}},events:{refresh:"onrefresh"},children:[{type:"loading-indicator",classList:["indicator"]},{type:"text",classList:["refresh-arrow"],style:{textAlign:"center",color:"rgb(238,162,54)"},shown:function(){return"hide"===this.refresh_display},attr:{value:"下拉刷新"}}]},{type:"cell",append:"tree",children:[{type:"scroller",children:[{type:"div",repeat:function(){return this.colArray},children:[{type:"col-item",attr:{content:function(){return this.content},objectid:function(){return this.objectId}}}]}]}]}]}]}},,,,,,,,,,,,,,function(t,e,n){t.exports=function(t,e,o){"use strict";n(11);var r=o("@weex-module/stream"),i=o("@weex-module/modal");t.exports={data:function(){return{refresh_display:"hide",colArray:[]}},methods:{onrefresh:function(t){var e=this;e.refresh_display="show",this.$call("timer","setTimeout",function(){e.refresh_display="hide"},2e3),e.refresh()},refresh:function(){var t=this;r.fetch({method:"GET",url:"https://leancloud.cn:443/1.1/classes/collection?limit=20&&order=-createdAt",headers:{"X-LC-Id":"zksrg6fpR18GjAsv0eHPs4Kz-gzGzoHsz","X-LC-Key":"XfkYkvCvsJ1FkhEqzdTsMnNC","content-type":"application/json"}},function(e){if(e.ok){t.colArray.splice(0,t.colArray.length);for(var n=JSON.parse(e.data),o=0;o<n.results.length;o++)t.colArray.push(n.results[o])}else i.toast({message:"这个可不怪我，是你的网络问题!",duration:2})})}},created:function(){var t=this;r.fetch({method:"GET",url:"https://leancloud.cn:443/1.1/classes/collection?limit=20&&order=-createdAt",headers:{"X-LC-Id":"zksrg6fpR18GjAsv0eHPs4Kz-gzGzoHsz","X-LC-Key":"XfkYkvCvsJ1FkhEqzdTsMnNC","content-type":"application/json"}},function(e){if(e.ok){for(var n=JSON.parse(e.data),o=0;o<n.results.length;o++)t.colArray.push(n.results[o]);i.toast({message:a,duration:2})}else i.toast({message:"Network Error!",duration:2})})}}}},,,,,,,,,,,,,,,function(t,e,n){n(82),n(95);var o=n(121),r=n(107),i=n(135);__weex_define__("@weex-component/dd026eb333d8e60776e5e46e991861ec",[],function(t,e,n){i(n,e,t),e.__esModule&&e.default&&(n.exports=e.default),n.exports.template=o,n.exports.style=r}),__weex_bootstrap__("@weex-component/dd026eb333d8e60776e5e46e991861ec",void 0,void 0)}]);