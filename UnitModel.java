public class UnitModel{
    private String name = "Generic";
    private int hitPoints = 0;
    private int speed = 0;
    private int armor = 0;
    private int magicArmor = 0;
    private int attack = 0;
    private int magicAttack = 0;
    private int posX = 0;
    private int posY = 0;

    public UnitModel(String n, int h, int s, int ar, int mAr, int at, int mAt, int pX, int pY){
	name = n;
	hitPoints = h;
	speed = s;
	armor = ar;
	magicArmor = mAr;
	attack = at;
	magicAttack = mAt;
	posX = pX;
	posY = pY;
    }

    public String getName(){
	return name;
    }

    public int getPosX(){
	return posX;
    }

    public int getPosY(){
	return posY;
    }

    public void faint(){
	System.out.println(name + "Ha caido.");
    }

    public void reciveDamage(int dmg){
	hitPoints -= dmg;
	System.out.println(name + " recibio " + dmg + " puntos de danio.");
	System.out.println(name + " tiene " + hitPoints + " de vida.");
    }
    public int doAttackTarget(UnitModel trg){
	int dmg = 0;
	if(attack < magicAttack){
	    dmg = (int)((magicAttack * 0.5) - (trg.magicArmor * 0.2));
	} else {
	    dmg = (int)((attack * 0.5) - (trg.armor * 0.4));
	}
	if(dmg < 0){
	    return 0;
	}
	return dmg;
    }

    public void doMove(char d, int maxX, int maxY){
	switch(d){
	case 'n':
	    posY -= speed;
	    if(posY < 0){
		posY = 0;
		System.out.println("Has llegado al límite norte del tablero.");
	    }
	    System.out.println("La posicion de " + name + " es (" + posX + ","
			       + posY + ").");
	    break;
	case 'e':
	    posX += speed;
	    if(posX > maxX){
		posX = maxX;
		System.out.println("Has llegado al límite este del tablero.");
	    }
	    System.out.println("La posicion de " + name + " es (" + posX + ","
			       + posY + ").");
	    break;
	case 's':
	    posY += speed;
	    if(posY > maxY){
		posY = maxY;
		System.out.println("Has llegado al límite sur del tablero.");
	    }
	    System.out.println("La posicion de " + name + " es (" + posX + ","
			       + posY + ").");
	    break;
	case 'w':
	    posX -= speed;
	    if(posX < 0){
		posX = 0;
		System.out.println("Has llegado al límite oeste del tablero.");
	    }
	    System.out.println("La posicion de " + name + " es (" + posX + ","
			       + posY + ").");
	    break;
	default:
	    System.out.println("La direccion no es valida.");
	    break;
	}
    }
}