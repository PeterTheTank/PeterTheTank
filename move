    public void randomMove(){
    	Random rand = new Random(360);
    	double r = rand.nextDouble() * 200; 
    	turnRight(r);
    	r = rand.nextDouble() * 200; 
     	ahead(50);
    	turnLeft(r);
    	ahead(50);
    }
