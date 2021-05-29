/*
	���ʵ��Person��Ķ���
*/

public class Person{
	// ��������  ��Ա������ = ��ʼֵ; ���г�ʼֵͨ������ʡ�Բ�д
	String name; // �������������ĳ�Ա����
	int age; // ������������ĳ�Ա����
	
	// �Զ����Ա����ʵ�����г�Ա�����Ĵ�ӡ
	// ����ֵ����  �������ƣ��β��б�{������;}
	public void show(){
		System.out.println("����" + this.name + ".����" + this.age + "���ˣ�"); // thisָ����ǵ�ǰ���õĶ���
	}
	
	// �Զ����Ա����ʵ�ֽ������޸�Ϊ����ָ����ֵ����Ϊ
	// String s = "guanyu";
	public void setName(String name){
		this.name = name;
	}
	
	// �Զ����Ա����ʵ�ֽ������޸�Ϊ����ָ����ֵ����Ϊ
	public void setAge(int age){
		this.age = age;
	}
	
	// �Զ����Ա����ʵ�ֽ������������޸�Ϊ����ָ����ֵ����Ϊ  ����ķ������Ƽ�ʹ��
	public void setNameAge(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// �Զ����Ա����ʵ�ֿɱ䳤������ʹ��  ����һά����ʹ�ü���  0 ~ n��
	public void showArgument(int num, String... args){
		System.out.println("num = " + num);
		for(int i = 0; i < args.length; i++){
			System.out.println("��" + (i+1) + "������Ϊ��" + args[i]);
		}
	}
	
	// �Զ����Ա����ʵ��������ֵ�Ļ�ȡ�����ص���Ϊ
	public String getName(){
		return this.name;
	}
	
	// �Զ����Ա����ʵ��������ֵ�Ļ�ȡ�����ص���Ϊ
	public int getAge(){
		return this.age;
	}
	public static void main(String[] args){
		// 1.����Person���͵�����ָ��Person���͵Ķ���
		// ��������(����) ���ñ����� = new ����();
		Person p = new Person();
		// 2.��ӡ�����еĳ�Ա����ֵ
		// ���ñ�����.��Ա������
		System.out.println("����" + p.name + ".����" + p.age + "���ˣ�");
		// ���ñ�����.��Ա������(ʵ���б�);
		// ���÷����ı��ʾ��Ǹ��ݷ�������ת��ȥִ�з����������ת�����λ��
		p.show();
		
		
		System.out.println("-----------------------------------------------------");
		// 3.�޸ĳ�Ա��������ֵ
		p.name = "zhangfei";
		p.age = 30;
		// 4. �ٴδ�ӡ�޸ĺ����ֵ
		//System.out.println("����" + p.name + "������" + p.age + "���ˣ�"); // zhangfei 30
		p.show();
		
		System.out.println("-----------------------------------------------------");
		// 5. ͨ����Ա�����ĵ���ʵ�ֳ�Ա�������޸�
		p.setName("guanyu");
		p.setAge(35);
		p.show(); // guanyu  35
		
		System.out.println("-----------------------------------------------------");
		// 6.ͨ����Ա����ͬʱ�޸�����������
		//p.setNameAge("liubei", 40);
		int ia = 40;
		p.setNameAge("liu"+"bei", ia);
		p.show(); // liubei 40
		
		System.out.println("-----------------------------------------------------");
		// 7.ͨ����Ա����ʵ�ֿɱ䳤�����Ĵ�ӡ
		p.showArgument(0);
		System.out.println("-----------------------------------------------------");
		p.showArgument(1, "����1");
		System.out.println("-----------------------------------------------------");
		p.showArgument(2, "����1", "����2");
		
		System.out.println("-----------------------------------------------------");
		// 8.ͨ����Ա�����ĵ���ʵ�ֳ�Ա������ֵ�Ļ�ȡ����ӡ
		String str1 = p.getName();
		System.out.println("��ȡ���������ǣ�" + str1);
		int ib = p.getAge();
		System.out.println("��ȡ���������ǣ�" + ib);
	}
}



