const fs = require("fs");
let x="value";
fs.readFile("../lib/file.txt",(err,data)=>{
	if(err){
		throw err;
	}
	let x=data.toString();
	
});


