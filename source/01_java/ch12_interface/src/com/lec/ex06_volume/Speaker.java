package com.lec.ex06_volume;
// Speaker s = new Speaker(45);
// s.volumeDown(10)
public class Speaker implements IVolume{
	private static final byte SPEAKER_MAX_VOLUME = 100;
	private static final byte SPEAKER_MIN_VOLUME = 0;
	private int volumeLevel;
	public Speaker() {}
	public Speaker(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}
	@Override
	public void volumeUp() {
		if(volumeLevel < SPEAKER_MAX_VOLUME) {
			volumeLevel ++;
			System.out.println("����Ŀ ������ 1�÷� ���� "+volumeLevel);
		}else {
			System.out.println("����Ŀ ������ �ִ�ġ���� �ø��� ���߽��ϴ�");
		}
	}
	@Override
	public void volumeUp(int level) {
		if(volumeLevel + level <= SPEAKER_MAX_VOLUME) { // level��ŭ ���� �ø�
			volumeLevel += level; //volumeLevel = volumeLevel + level;
			System.out.println("����Ŀ ������ "+level+"�÷� ���� "+volumeLevel);
		}else { // level��ŭ �� �ø� ��� ex. ���� ���� 45 level 10 => �ŭ �ø��� ���(5),  ������ 50
			int tempLevel = SPEAKER_MAX_VOLUME - volumeLevel; 
			volumeLevel = SPEAKER_MAX_VOLUME;
			System.out.println("����Ŀ ������ "+level+"��ŭ �� �ø��� "+tempLevel+"��ŭ �÷� �ִ�ġ "+SPEAKER_MAX_VOLUME);
		}// if
	}
	@Override
	public void volumeDown() {
		if(volumeLevel > SPEAKER_MIN_VOLUME) {// volumeLevel�� ���� �� �ִ� ���
			volumeLevel -- ;
			System.out.println("����Ŀ ������ 1���� ���� "+volumeLevel);
		}else {// volumeLevel�� �ּ�ġ���� �� ������ ���
			System.out.println("����Ŀ ������ �ּ�ġ���� ������ ���߽��ϴ�");
		}
	}
	@Override
	public void volumeDown(int level) {
		if(volumeLevel - level >= SPEAKER_MIN_VOLUME) { // level��ŭ ���� ����
			volumeLevel -= level; //volumeLevel = volumeLevel - level;
			System.out.println("����Ŀ ������ "+level+"���� ���� "+volumeLevel);
		}else { // level��ŭ �� ���� ��� ex. ���� ���� 5 level 10 => �ŭ ������ ���(5),  ������ 0����
			int tempLevel = volumeLevel - SPEAKER_MIN_VOLUME; 
			volumeLevel = SPEAKER_MIN_VOLUME;
			System.out.println("����Ŀ ������ "+level+"��ŭ �� ������ "+tempLevel+"��ŭ ���� �ּ�ġ "+SPEAKER_MIN_VOLUME);
		}// if
	}
}













