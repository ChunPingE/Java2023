package ch16.sec02.exam02;

// 700p(lambda) -> 420p(anonymous) -> 412(concrete class)
public class ButtonExmaple {
	public static void main(String[] args) {
		Button btnOk = new Button();

		btnOk.setClickListener(() -> {
			System.out.println("Ok버튼을 클릭했습니다.");
		});

		btnOk.click();

		Button btnCancel = new Button();

		btnCancel.setClickListener(() -> {
			System.out.println("Cancel버튼을 클릭했습니다.");
		});

		btnCancel.click();
	}
}
