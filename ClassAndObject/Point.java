/*
	���ʵ��point��Ķ���
*/

public class Point{
	int x; // ��������������ĳ�Ա����
	int y; // ��������������ĳ�Ա����
	
	// �Զ����Ա����ʵ�ֳ�Ա������ֵ�Ĵ�ӡ����
	void show(){
		System.out.println("�������ǣ�" + this.x + ".�������ǣ�" + this.y);
	}
	
	// �Զ����Ա����ʵ�ֽ��������޸�Ϊ����ָ����ֵ����Ϊ
	// int i = 10;
	public void setX(int x){
		this.x = x;
	}
	// �Զ����Ա����ʵ�ֽ��������޸�Ϊ����ָ����ֵ����Ϊ
	// int j = 20;
	public void setY(int y){
		this.y = y;
	}
	
	// �Զ���Ա����ʵ��int���͵Ŀɱ䳤������ʹ��
	public void	showArgument(int ... args){
		for (int i = 0; i < args.length; i ++){
			System.out.println("�±�Ϊ" + i + "��Ԫ���ǣ�" + args[i]);
		}
	}
	
	// �Զ����Ա����ʵ�ֻ�ȡ��������ֵ�����ص���Ϊ
	public int getX(){
		return this.x;
	}
	
	// �Զ����Ա����ʵ�ֻ�ȡ��������ֵ�����ص���Ϊ
	public int getY(){
		return this.y;
	}
	
	public static void main(String[] args){
		// ����Point���͵�����ָ��Point���͵Ķ���
		Point p = new Point();
		// ��ӡ��Ա��������ֵ
		System.out.println("�������ǣ�" + p.x + "���������ǣ�" + p.y); // 0 0
		p.show();
		
		// 2.�����������޸�Ϊ3��5���ٴδ�ӡ
		p.x = 3;
		p.y = 5;
		System.out.println("�������ǣ�" + p.x + "���������ǣ�" + p.y); // 0 0
		p.show();
		
		System.out.println("-----------------------------------------------");
		// 3.ͨ�����ó�Ա����ʵ�ֺ���������޸�
		p.setX(10);
		p.setY(20);
		p.show(); // 10 20
		
		System.out.println("-----------------------------------------------");
		// 4.ͨ����Ա����ʵ�ֿɱ䳤������ʹ��
		p.showArgument(1, 2, 3, 4, 5);
		System.out.println("-----------------------------------------------");
		// 5.ͨ����Ա��������ʵ�ֺ�������Ļ�ȡ
		int ia = p.getX();
		System.out.println("��ȡ���ĺ������ǣ�" + ia); // 10
		int ib = p.getY();
		System.out.println("��ȡ���ĺ�������: " + ib); // 20
		
	}
}