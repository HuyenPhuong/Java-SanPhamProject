package SanPham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MainClass {
	public static void main(String[] args) {
		SanPham sp1 = new SanPham(1, "iPhone 8", 800, 10, 0);
		SanPham sp2 = new SanPham(2, "iPhone 10", 1000, 15, 0);
		SanPham sp3 = new SanPham(3, "iPhone 11", 1200, 20, 0);
		SanPham sp4 = new SanPham(4, "iPhone 12", 1300, 22, 0);
		SanPham sp5 = new SanPham(5, "iPhone 13", 1500, 15, 0);

		ArrayList<SanPham> arrSp = new ArrayList<>();
		arrSp.add(sp1);
		arrSp.add(sp2);
		arrSp.add(sp3);
		arrSp.add(sp4);
		arrSp.add(sp5);
		
		Collections.sort(arrSp, 
			    Comparator.comparing(SanPham::getTongTien).reversed());
		
		System.out.println("ID\t|Ten San pham\t|Gia ban\t|Soluong\t|Thanh tien");
		for (SanPham obj : arrSp) {
			System.out.println(obj.getMa() + "\t|" + obj.getName() + "\t|" + obj.getGia() + "\t|" + obj.getSoLuong()
					+ "\t|" + obj.getTongTien());
		}
	}

}
