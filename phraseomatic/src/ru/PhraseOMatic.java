 package src.ru;

public class PhraseOMatic {
	public static void main(String[] args) {
		
		String[] wordListOne = {"круглосуточный", "взаимный", "умный", "сфокусированный", "динамичный", "выровненный"};
		
		String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный", "фирменный", "сетевой", "общий"};
		
		String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант", "подход", "период времени", "образец"};
		
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

System.out.println("Все, что нам нужно, - это " + phrase);
	}
}	
		