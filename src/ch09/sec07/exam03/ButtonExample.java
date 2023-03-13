package ch09.sec07.exam03;

public class ButtonExample {
	public static void main(String[] args) {
		//Button객체 생성
		Button btnOk = new Button();
		
		btnOk.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok버튼을 출력했습니다.");
			}
		});
		
		//Ok버튼 클릭하기
		btnOk.click();
		
		//--------------------
		
		//Button객체 생성
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 출력했습니다.");
			}
		});
		
		//Ok버튼 클릭하기
		btnCancel.click();
	}

}
