var exit = false;
while(exit === false){
var tools  = ["rock", "paper", 'scissors'];
confirm('Welcome to Rock, Paper Scissors');
var item = prompt("What item do you want to use? You can do Rock, Paper, Scissors, or Close");
item = item.trim();
item = item.toLowerCase();
item = item.substring(0, 1);
if(item === "r"){
	var fitem = "rock";
}else if(item === "p"){
	var fitem = "paper";
}else if(item === "s"){
	var fitem = "scissors";
}
if(item === "r"|item === "p"|item === "s"){
    var computerTool = Math.floor(( Math.random() * 4));
    computerTool = tools[computerTool];
    confirm("You did " + fitem + ". Computer did " + computerTool);
    if(fitem === computerTool){
        confirm("You Tied");
    }else if(item === "r"){
        if(computerTool === "paper"){
            confirm("You Lost");
        }else{
            confirm("You Win");
        }
    }else if(item === "p"){
        if(computerTool === "scissors"){
            confirm("You Lose");
        }else{
            confirm("You Win");
        }
    }else if(item == "s"){
        if(computerTool === "rock"){
            confirm("You Lose");
        }else{
            confirm("You Win");
        }
    }
}else{
	if(item === "c"){
			exit = true;
	}else{
    confirm("that was not an option");
	}
}
}