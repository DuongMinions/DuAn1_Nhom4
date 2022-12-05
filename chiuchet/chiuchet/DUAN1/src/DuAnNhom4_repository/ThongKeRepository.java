/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_viewmodel.vThongKe;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author TRAN VAN DUONG
 */
public class ThongKeRepository {

    public List<vThongKe> getListByThongKe() {
        try {
            Connection con = DBContext1.getConnection();
            String query = "select TENSP, HOADONMUAHANG.SOLUONG,HOADONMUAHANG.NGAYTAOHOADON\n"
                    + "                    from HOADONMUAHANG join HOADONCHITIET on HOADONMUAHANG.ID = HOADONCHITIET.IDHOADONMUAHANG\n"
                    + "                    join SANPHAM on HOADONCHITIET.IDSP = SANPHAM.Id ";
            List<vThongKe> list = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vThongKe thongKe = new vThongKe();
                thongKe.setTenSp(rs.getString(1));
                thongKe.setSoLuong(rs.getInt(2));
                thongKe.setNgayTaoHoaDon(rs.getString(3));
                list.add(thongKe);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<vThongKe> getListByThongKeNam() {
        try {
            Connection con = DBContext1.getConnection();
            String query = "SELECT CONCAT(YEAR(NGAYTAOHOADON), ''), SUM(TONGTIEN)\n"
                    + "FROM HOADONMUAHANG\n"
                    + "GROUP BY YEAR(NGAYTAOHOADON)";
            List<vThongKe> listThang = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vThongKe thongKeThang = new vThongKe();
                thongKeThang.setNgayTaoHoaDon(rs.getString(1));
                thongKeThang.setThanhTien(rs.getBigDecimal(2));
                listThang.add(thongKeThang);
            }
            return listThang;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<vThongKe> getListByThongKeNgay() {
        try {
            Connection con = DBContext1.getConnection();
            String query = "	select Concat(NGAYTAOHOADON,''), sum(TONGTIEN) as Tong_tien from HOADONMUAHANG\n"
                    + "	group by NGAYTAOHOADON";
            List<vThongKe> listThang = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vThongKe thongKeThang = new vThongKe();
                thongKeThang.setNgayTaoHoaDon(rs.getString(1));
                thongKeThang.setThanhTien(rs.getBigDecimal(2));
                listThang.add(thongKeThang);
            }
            return listThang;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public List<vThongKe> getLisTimAll(String ngayTaoHoaDon) {
//        try {
//            Connection con = DBContext1.getConnection();
//            String query = "select SANPHAM.TENSP, HOADONMUAHANG.NGAYTAOHOADON,HOADONMUAHANG.SOLUONG, SANPHAM.GIABAN,"
//                    + " HOADONMUAHANG.TONGTIEN from HOADONMUAHANG join HOADONCHITIET on HOADONMUAHANG.ID = "
//                    + "HOADONCHITIET.IDHOADONMUAHANG join SANPHAM ON HOADONCHITIET.IDSP = SANPHAM.Id";
//            List<vThongKe> listThang = new ArrayList<>();
//            PreparedStatement ps = con.prepareCall(query);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                vThongKe thongKe = new vThongKe();
//                thongKe.setTenSp(rs.getString(1));
//                thongKe.setNgayTaoHoaDon(rs.getString(2));
//                thongKe.setSoLuong(rs.getInt(3));
//                thongKe.setDonGia(rs.getBigDecimal(4));
//                thongKe.setThanhTien(rs.getBigDecimal(5));
//                listThang.add(thongKe);
//            }
//            return listThang;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    public List<vThongKe> getListByThongKeThang() {
        try {
            Connection con = DBContext1.getConnection();
            String query = "select concat(MONTH(NGAYTAOHOADON),'-',YEAR(NGAYTAOHOADON)), sum(TONGTIEN) from HOADONMUAHANG\n"
                    + "group by month(NGAYTAOHOADON), YEAR(NGAYTAOHOADON)";
            List<vThongKe> listThang = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vThongKe thongKeThang = new vThongKe();
                thongKeThang.setNgayTaoHoaDon(rs.getString(1));
                thongKeThang.setThanhTien(rs.getBigDecimal(2));
                listThang.add(thongKeThang);
            }
            return listThang;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
