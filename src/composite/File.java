package composite;

import java.util.ArrayList;
import java.util.List;

public interface File {
	void kill();
}

class TextFile implements File{

	@Override
	public void kill() {
		System.out.println("�ı��ļ����ڲ�ɱ");	
	}
}
class ImageFile implements File{

	@Override
	public void kill() {
		System.out.println("ͼ���ļ����ڲ�ɱ");	
	}
}
class VideoFile implements File{

	@Override
	public void kill() {
		System.out.println("��Ƶ�ļ����ڲ�ɱ");	
	}
}
class Folder implements File{

	private List<File> list = new ArrayList<File>();
	
	@Override
	public void kill() {
		System.out.println("�ļ������ڲ�ɱ");
		for(File file : list) {
			file.kill();
		}
		
	}
	
	public void add(File f) {
		list.add(f);
	}
	public void remove(File f) {
		list.remove(f);
	}
	
	
}