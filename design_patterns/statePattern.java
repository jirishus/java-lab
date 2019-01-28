public class statePattern {
	public static void main(String []args) {
		System.out.println("main app init");

		Helper helper = new Helper();
		helper.showInfo();
	}

}

class Helper {
	Helper() {};

	void showInfo() {
		System.out.println("Shwowing instance info");
	}
}
