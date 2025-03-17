package ex2_override;

public class Spider extends Animal {
	String web = "거미줄을 만듦";

	@Override
	public int getEye() {
		return 8;
	} // getEye

	@Override
	public int getLeg() {
		return 8;
	} // getLeg
}
