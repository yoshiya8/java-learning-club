// Check if the user is ready to play!
var greet = function(){
    if(prompt("Are you ready to play (yes/no)") == "yes"){
        confirm("good");
        checkAge();
    }else{
        confirm("come on I worked hard on this");
        greetm();
    }
}
var greetm = function(){
    greet();   
}
var checkAge = function(){
    var age = prompt("What's your age");
    if(age < 13){
        confirm("You are allowed to play");
        start();
    }else{
        confirm("you are too old to play");
    }
}
var start = function(){
    confirm("You are at a Justin Bieber concert, and you hear this lyric 'Lace my shoes off, start racing.'");
    confirm("Suddenly, Bieber stops and says, 'Who wants to race me?'");
    userAnswer = prompt("Do you want to race Bieber on stage?");
    continue();
}
var continue = function(){
    if(userAnswer == "yes"){
        confirm("You and Bieber start racing. It's neck and neck! You win by a shoelace!");
    }else{
        confirm("Oh no! Bieber shakes his head and sings 'I set a pace, so I can race without pacing.'");
    }
}
greet();