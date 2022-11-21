
public class PrimaryStudent extends Student {
	private int grade;
	// 定义构造函数 获取参数 
	// super调用父级的构建函数
	// this.grade 初始化 自身变量
	// 创建自身 方法。
	public PrimaryStudent(String name, int age, int score,int grade) {
		super(name, age, score);
		// TODO Auto-generated constructor stub
		this.grade = grade;
	}
	public int getGrade() {
		return this.grade;
	}
}
