var net = require("net")

var sock = net.connect({
	port: 6080,
	host: "127.0.0.1",
}, function(){
	console.log("connected to server  !");
});

sock.on("connect", function(){
	console.log("connect success");
	sock.write("hello !");
});

sock.on("error", function(e){
	console.log("error", e);
});

sock.on("close", function(){
	console.log("close");
});

sock.on("end", function(){
	console.log("end event");
});

sock.on("data", function(data){
	console.log(data.toString());
});