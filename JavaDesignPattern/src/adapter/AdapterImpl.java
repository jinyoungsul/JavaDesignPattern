package adapter;

public class AdapterImpl implements Adapter{

	@Override
	public Float twiceOf(Float num) {
		System.out.println("두배 시작");
		return (float) Math.twoTime(num.doubleValue());
	}

	@Override
	public Float halfOf(Float num) {
		System.out.println("반 시작");
		return (float) Math.half(num.doubleValue());
	}
	
}
