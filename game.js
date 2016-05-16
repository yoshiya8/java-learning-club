var exit = true;
var rockPaperScissors = function(){
exit = false;
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
if(item === "r"||item === "p"||item === "s"){
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
}
var guessTheNumber = function(){
	exit = false;
	while(exit === false){
		var guesses = 0;
		var computerNumber = Math.floor(((Math.random()*100)+1));
		while(playerGuess != computerNumber){
			var playerGuess = prompt("The computer is thinking of an integer 1-100");
			if(playerGuess >= 1 && playerGuess <= 100 && Math.floor(playerGuess) == playerGuess){
				guesses++;
				if(playerGuess == computerNumber){
					confirm("You guessed the computer's number!");
					confirm("it took you " + guesses + " tries");
					exit = true;
				}else if(playerGuess > computerNumber){
					confirm("you were too high");
				}else{
					confirm("you were too low");
				}
			}else{
				confirm("That is not a choice, it must be an integer between 1 and 100");
			}
		}
	}
}
var thinkOfANumber = function(){
	
}
while(exit){
	var game = prompt("What game dou you want to play? CHOICES: rock paper scissors, you guess the number, computer guesses the number(doesn't work)");
	game = game.trim();
	game = game.toLowerCase();
	game = game.substring(0, 1);
	if(game === "r"){
		rockPaperScissors();
	}else if(game === "y"){
		guessTheNumber();
	}else if(game === "c"){
		thinkOfANumber();
	}
}