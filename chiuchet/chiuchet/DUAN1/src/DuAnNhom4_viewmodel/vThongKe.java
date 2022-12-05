/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_viewmodel;

import DuAnNhom4_model.HoaDonDatHang;
import DuAnNhom4_model.HoaDonMuahang;
import DuAnNhom4_model.SanPham;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author TRAN VAN DUONG
 */
public class vThongKe {

    HoaDonDatHang hoaDonDatHang;
    HoaDonMuahang hoaDonMuaHang;
    SanPham sanPham;
    String ngayThanhToan;
    String ngayTaoHoaDon;
    BigDecimal DonGia;
    int soLuong;
    String tenSp;
    BigDecimal ThanhTien;

    public vThongKe() {
    }

    public vThongKe(HoaDonDatHang hoaDonDatHang, HoaDonMuahang hoaDonMuaHang, SanPham sanPham, String ngayThanhToan, String ngayTaoHoaDon, BigDecimal DonGia, int soLuong, String tenSp, BigDecimal ThanhTien) {
        this.hoaDonDatHang = hoaDonDatHang;
        this.hoaDonMuaHang = hoaDonMuaHang;
        this.sanPham = sanPham;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayTaoHoaDon = ngayTaoHoaDon;
        this.DonGia = DonGia;
        this.soLuong = soLuong;
        this.tenSp = tenSp;
        this.ThanhTien = ThanhTien;
    }

    public HoaDonDatHang getHoaDonDatHang() {
        return hoaDonDatHang;
    }

    public void setHoaDonDatHang(HoaDonDatHang hoaDonDatHang) {
        this.hoaDonDatHang = hoaDonDatHang;
    }

    public HoaDonMuahang getHoaDonMuaHang() {
        return hoaDonMuaHang;
    }

    public void setHoaDonMuaHang(HoaDonMuahang hoaDonMuaHang) {
        this.hoaDonMuaHang = hoaDonMuaHang;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getNgayTaoHoaDon() {
        return ngayTaoHoaDon;
    }

    public void setNgayTaoHoaDon(String ngayTaoHoaDon) {
        this.ngayTaoHoaDon = ngayTaoHoaDon;
    }

    public BigDecimal getDonGia() {
        return DonGia;
    }

    public void setDonGia(BigDecimal DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public BigDecimal getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(BigDecimal ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    @Override
    public String toString() {
        return "vThongKe{" + "hoaDonDatHang=" + hoaDonDatHang + ", hoaDonMuaHang=" + hoaDonMuaHang + ", sanPham=" + sanPham + ", ngayThanhToan=" + ngayThanhToan + ", ngayTaoHoaDon=" + ngayTaoHoaDon + ", DonGia=" + DonGia + ", soLuong=" + soLuong + ", tenSp=" + tenSp + ", ThanhTien=" + ThanhTien + '}';
    }

}
