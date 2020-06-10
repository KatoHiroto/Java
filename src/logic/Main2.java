package logic;

import java.util.ArrayList;

import bean.StudentBean;
import dao.StudentDao;

public class Main2 {

	public static void main(String[] args) {

		//ID=2の学生を検索
		//		StudentBean sb = StudentDao.selectStudent(1);

		//検索結果を表示する
		//		System.out.println("名前：" + sb.getName());
		//		System.out.println("年齢：" + sb.getAge());


		//		System.out.println("-------------------------------");
		//		//全件検索の実行
		ArrayList<StudentBean> list = StudentDao.selectAllStudent();
		//
		//		//結果の表示(拡張forを使ってます)
		for( StudentBean s : list){
			System.out.println("ID：" + s.getId());

		System.out.println("名前：" + s.getName());
		System.out.println("年齢：" + s.getAge());
	}

}
}


