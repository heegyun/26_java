package day10;

class CCTV {
	private String resolution;
	public CCTV(String resolution) { this.resolution = resolution; }
	protected String getResolution() { return resolution; }
}


public class AICCTV  extends CCTV {
	private boolean faceRecognition;
	public AICCTV(String resolution, boolean faceRecognition) {
		super(resolution);
		this.faceRecognition = faceRecognition;
	}
	public void printInfo() {
		System.out.print("CCTV는 " + getResolution() + "급이며, ");
		if(faceRecognition == true)
			System.out.print("현재 얼굴인식 작동 중");
		else
			System.out.print("현재 얼굴인식 작동하지 않음");			
	}
	
	public static void main(String[] args) {
		AICCTV ai = new AICCTV("FHD", true); // "FHD" 급의 해상도로 얼굴 인식 활성화
		ai.printInfo();
	}

}
