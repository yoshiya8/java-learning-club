//THIS IS THE PC COMMAND MOD FOR SINGLEPLAYER
//sets the var playerName to their username
var playerName = getPlayerName(getPlayerEnt());
//makes a list of all the potion effects
var potionEffectsId = ["MobEffect.movementSpeed", "MobEffect.movementSlowdown", "MobEffect.digSpeed", "MobEffect.digSlowdown", "MobEffect.damageBoost", "MobEffect.heal", "MobEffect.harm", "MobEffect.jump", "MobEffect.confusion", "MobEffect.regeneration", "MobEffect.damageResistance", "MobEffect.fireResistance", "MobEffect.waterBreathing", "MobEffect.invisibility", "MobEffect.blindness", "MobEffect.nightVision", "MobEffect.nightVision", "MobEffect.hunger", "MobEffect.weakness", "MobEffect.poison", "MobEffect.wither", "MobEffect.healthBoost", "MobEffect.absorption", "MobEffect.saturation"];
//makes a list of all the enchantments
var enchantmentId = ["Enchantment.PROTECTION", "Enchantment.FIRE_PROTECTION", "Enchantment.FEATHER_FALLING", "Enchantment.BLAST_PROTECTION", "Enchantment.PROJECTILE_PROTECTION", "Enchantment.THORNS", "Enchantment.RESPIRATION", "Enchantment.AQUA_AFFINITY", "Enchantment.DEPTH_STRIDER", "Enchantment.SHARPNESS", "Enchantment.SMITE", "Enchantment.BANE_OF_ARTHROPODS", "Enchantment.KNOCKBACK", "Enchantment.FIRE_ASPECT", "Enchantment.LOOTING", "Enchantment.EFFICIENCY", "Enchantment.SILK_TOUCH", "Enchantment.UNBREAKING", "Enchantment.FORTUNE", "Enchantment.POWER", "Enchantment.PUNCH", "Enchantment.FLAME", "Enchantment.INFINITY", "Enchantment.LUCK_OF_THE_SEA", "Enchantment.LURE"];
//makes the commands
function procCmd(cmd){
//clear
if(cmd[0] == "clear"){
	//makes sure that they are trying to clear their own inventory
	if(cmd[1] == playerName || cmd[1] == ""){
		//clears their inventory
		for(var inventorySlot = 1; inventorySlot < 37; inventorySlot ++){
			Player.clearInventorySlot(inventorySlot);
		}
		//clears their armor
		Player.setArmorSlot(1, 0, 0);
		Player.setArmorSlot(2, 0, 0);
		Player.setArmorSlot(3, 0, 0);
		Player.setArmorSlot(4, 0, 0);
	}else{
		//informs them that they can only clear their own inventory if they try to clear someone elses
		clientMessage(ChatColor.RED + "ERROR: You can only clear your own inventory");
	}
}
//effect
if(cmd == "effect"){
	//makes sure that the player is effecting themself
	if(cmd[1] == playerName){
		//figures out if they want particles of not
		function getParticleDesire(){
			if(cmd[6] == "false"){
				return("false");
			}else{
				return("true")
			}
		}
		//gives them the desired effect
		Entity.addEffect(getPlayerEnt(), potionEffectsId[cmd[2] - 1], cmd[3]*20, cmd[4], false, getParticleDesire());
	}else{
		//informs them that they can only effect themself
		clientMessage(ChatColor.RED + "ERROR: you can only effect yourself");
	}
}
//enchant
if(cmd[0] == "enchant"){
	//makes sure that they are enchanting their own tool
	if(cmd[1] == playerName){
		
	}else{
		//informs them that they can only enchant their own things
		clientMessage(ChatColor.RED + "ERROR: you can only enchant your own items");
	}
}
}
