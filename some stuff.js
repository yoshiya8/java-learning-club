var getRandomInt(x, y){
	var randomNumber = x;
	while(randomNumber == x||randomNumber == y){
		var randomInterval = y-x;
		randomNumber = Math.ceil(Math.random()*randomInterval)+x-1;
	}
	return randomNumber;
}
confirm(getRandomInt(1, 2));
