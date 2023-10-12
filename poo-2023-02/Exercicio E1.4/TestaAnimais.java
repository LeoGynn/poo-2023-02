class TestaAnimais{
    public static void main(String[] args) {
		//Array de três componentes da classe Animal
    	Animal[] animais = new Animal[3];

		//instância de cada animal e depositar a referência no array
    	animais[0] = new Sapo();
    	animais[1] = new Cachorro();
    	animais[2] = new Boi();

    	for (Animal animal : animais) {
            String somDoAnimal = animal.som();
            System.out.println(somDoAnimal);
    	}	
	}
}