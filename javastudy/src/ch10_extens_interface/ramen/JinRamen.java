package ch10_extens_interface.ramen;

public class JinRamen extends Ramen {

	public JinRamen(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면과 스프를 넣고 3분후에 드세요.");
		System.out.println("한강라면 스팀은 400ml!.");
	}
	}



	


