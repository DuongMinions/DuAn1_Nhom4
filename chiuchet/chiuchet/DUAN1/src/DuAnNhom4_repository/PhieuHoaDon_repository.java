/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_utility.JDBC_Helper;
import DuAnNhom4_viewmodel.vPhieuHoaDon;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dell
 */
public class PhieuHoaDon_repository {

    public static List<vPhieuHoaDon> getAll() {
        List<vPhieuHoaDon> list = new ArrayList();
        ResultSet rs;
        String sql = "SELECT HOADONDATHANG.ID, SANPHAM.ID,TENSANPHAM,DONGIA,HOADONDATHANG.SIZE,HOADONDATHANG.MAUSAC,HOADONDATHANG.HINHANH,TENNGUOINHAN,HOADONDATHANG.SOLUONG,NGAYTAOHOADON,DAICHI,SDT,THANHTIEN,HOADONDATHANG.TRANGTHAI,PHUONGTHUCTHANHTOAN,NGAYTHANHTOAN FROM SANPHAM JOIN HOADONDATHANG ON HOADONDATHANG.IDSP = SANPHAM.ID ";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                String IDSP = rs.getString(2);
                String TENSP = rs.getString(3);
                BigDecimal GIABAN = rs.getBigDecimal(4);
                String SIZE = rs.getString(5);
                String MAUSAC = rs.getString(6);
                String HINHANH = rs.getString(7);
                String TENNGUOINHAN = rs.getString(8);
                int SOLUONG = rs.getInt(9);
                Date NGAYDATHANG = rs.getDate(10);
                String DIACHI = rs.getString(11);
                String SDT = rs.getString(12);
                BigDecimal THANHTIEN = rs.getBigDecimal(13);
                int TRANGTHAI = rs.getInt(14);
                String PHUONGTHUCTHANHTOAN = rs.getString(15);
                Date NGAYTHANHTOAN = rs.getDate(16);
                vPhieuHoaDon v = new vPhieuHoaDon(ID, IDSP, TENSP, SIZE, MAUSAC, TENNGUOINHAN, DIACHI, SDT, HINHANH, SOLUONG, NGAYDATHANG, GIABAN, THANHTIEN, TRANGTHAI, PHUONGTHUCTHANHTOAN, NGAYTHANHTOAN);
                list.add(v);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static List<vPhieuHoaDon> getAll1() {
        List<vPhieuHoaDon> list = new ArrayList();
        ResultSet rs;
        String sql = "SELECT SANPHAM.ID,TENSANPHAM,DONGIA,HOADONDATHANG.SIZE,HOADONDATHANG.MAUSAC,HOADONDATHANG.HINHANH,HOADONDATHANG.SOLUONG,NGAYTAOHOADON,THANHTIEN FROM SANPHAM JOIN HOADONDATHANG ON HOADONDATHANG.IDSP = SANPHAM.ID ";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String IDSP = rs.getString(1);
                String TENSP = rs.getString(2);
                BigDecimal GIABAN = rs.getBigDecimal(3);
                String SIZE = rs.getString(4);
                String MAUSAC = rs.getString(5);
                String HINHANH = rs.getString(6);
                int SOLUONG = rs.getInt(7);
                Date NGAYDATHANG = rs.getDate(8);
                BigDecimal THANHTIEN = rs.getBigDecimal(9);
                vPhieuHoaDon v = new vPhieuHoaDon(IDSP, TENSP, SIZE, MAUSAC, HINHANH, SOLUONG, NGAYDATHANG, GIABAN, THANHTIEN);
                list.add(v);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public static int them2(vPhieuHoaDon v) {
//        String sql = "insert into HOADONDATHANG(IDSP,TENSP,SOLUONG,HINHANH,SIZE,MAUSAC,GIABAN,TENNGUOINHAN,DIACHI,SDT,NGAYTAOHOADON,THANHTIEN) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
//        return JDBC_Helper.updateTongQuat(sql, v.getIDSP(), v.getTENSP(),
//                v.getSoLuong(),
//                v.getHINHANH(),
//                v.getSIZE(),
//                v.getMAUSAC(),
//                v.getGIABAN(),
//                v.getTENNGUOINHAN(),
//                v.getDIACHI(),
//                v.getSDT(),
//                v.getNGAYDATHANG(),
//                v.getTHANHTIEN());
//    }
    public static int them1(vPhieuHoaDon v) {
        String sql = "insert into HOADONDATHANG(IDSP,TENSANPHAM,SOLUONG,HINHANH,SIZE,MAUSAC,DONGIA,NGAYTAOHOADON,THANHTIEN) values(?,?,?,?,?,?,?,?,?)";
        return JDBC_Helper.updateTongQuat(sql, v.getIDSP(), v.getTENSP(),
                v.getSoLuong(),
                v.getHINHANH(),
                v.getSIZE(),
                v.getMAUSAC(),
                v.getGIABAN(),
                v.getNGAYDATHANG(),
                v.getTHANHTIEN());
    }

    public static int UPDATE(vPhieuHoaDon vhd) {
        String sql = "update HOADONDATHANG set TENNGUOINHAN = ?, DAICHI = ?, SDT = ?, TRANGTHAI = ?, PHUONGTHUCTHANHTOAN = ? where ID=? ";
        return JDBC_Helper.updateTongQuat(sql, vhd.getTENNGUOINHAN(), vhd.getDIACHI(), vhd.getSDT(),
                vhd.getTRANGTHAI(), vhd.getPHUOWNGTHUCTHANHTOAN(), vhd.getID());
    }

    public static void main(String[] args) {
        // check các chức năng tại đây
        List<vPhieuHoaDon> listCheck = new ArrayList<>();
        listCheck = getAll();
        for (vPhieuHoaDon x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }
}
