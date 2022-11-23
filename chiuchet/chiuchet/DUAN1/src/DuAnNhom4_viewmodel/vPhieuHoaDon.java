/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_viewmodel;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class vPhieuHoaDon {

    private String ID, IDSP, TENSP, SIZE, MAUSAC, TENNGUOINHAN, DIACHI, SDT, HINHANH;
    private int SoLuong;
    private Date NGAYDATHANG;
    private BigDecimal GIABAN, THANHTIEN;
    private int TRANGTHAI;
    private String PHUOWNGTHUCTHANHTOAN;
    private Date NGAYTHANHTOAN;

    public vPhieuHoaDon() {
    }

    public vPhieuHoaDon(String ID, String IDSP, String TENSP, String SIZE, String MAUSAC, String TENNGUOINHAN, String DIACHI, String SDT, String HINHANH, int SoLuong, Date NGAYDATHANG, BigDecimal GIABAN, BigDecimal THANHTIEN, int TRANGTHAI, String PHUOWNGTHUCTHANHTOAN,Date NGAYTHANHTOAN) {
        this.ID = ID;
        this.IDSP = IDSP;
        this.TENSP = TENSP;
        this.SIZE = SIZE;
        this.MAUSAC = MAUSAC;
        this.TENNGUOINHAN = TENNGUOINHAN;
        this.DIACHI = DIACHI;
        this.SDT = SDT;
        this.HINHANH = HINHANH;
        this.SoLuong = SoLuong;
        this.NGAYDATHANG = NGAYDATHANG;
        this.GIABAN = GIABAN;
        this.THANHTIEN = THANHTIEN;
        this.TRANGTHAI = TRANGTHAI;
        this.NGAYTHANHTOAN = NGAYTHANHTOAN;
    }

    public vPhieuHoaDon(String IDSP, String TENSP, String SIZE, String MAUSAC, String HINHANH, int SOLUONG, Date NGAYDATHANG, BigDecimal GIABAN, BigDecimal THANHTIEN) {
        this.IDSP = IDSP;
        this.TENSP = TENSP;
        this.SIZE = SIZE;
        this.MAUSAC = MAUSAC;
        this.HINHANH = HINHANH;
        this.SoLuong = SOLUONG;
        this.NGAYDATHANG = NGAYDATHANG;
        this.GIABAN = GIABAN;
        this.THANHTIEN = THANHTIEN;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPHUOWNGTHUCTHANHTOAN() {
        return PHUOWNGTHUCTHANHTOAN;
    }

    public void setPHUOWNGTHUCTHANHTOAN(String PHUOWNGTHUCTHANHTOAN) {
        this.PHUOWNGTHUCTHANHTOAN = PHUOWNGTHUCTHANHTOAN;
    }

    public String getHINHANH() {
        return HINHANH;
    }

    public void setHINHANH(String HINHANH) {
        this.HINHANH = HINHANH;
    }

    public String getIDSP() {
        return IDSP;
    }

    public void setIDSP(String IDSP) {
        this.IDSP = IDSP;
    }

    public String getTENSP() {
        return TENSP;
    }

    public void setTENSP(String TENSP) {
        this.TENSP = TENSP;
    }

    public String getSIZE() {
        return SIZE;
    }

    public void setSIZE(String SIZE) {
        this.SIZE = SIZE;
    }

    public String getMAUSAC() {
        return MAUSAC;
    }

    public void setMAUSAC(String MAUSAC) {
        this.MAUSAC = MAUSAC;
    }

    public String getTENNGUOINHAN() {
        return TENNGUOINHAN;
    }

    public void setTENNGUOINHAN(String TENNGUOINHAN) {
        this.TENNGUOINHAN = TENNGUOINHAN;
    }

    public String getDIACHI() {
        return DIACHI;
    }

    public void setDIACHI(String DIACHI) {
        this.DIACHI = DIACHI;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Date getNGAYDATHANG() {
        return NGAYDATHANG;
    }

    public void setNGAYDATHANG(Date NGAYDATHANG) {
        this.NGAYDATHANG = NGAYDATHANG;
    }

    public BigDecimal getGIABAN() {
        return GIABAN;
    }

    public void setGIABAN(BigDecimal GIABAN) {
        this.GIABAN = GIABAN;
    }

    public BigDecimal getTHANHTIEN() {
        return THANHTIEN;
    }

    public void setTHANHTIEN(BigDecimal THANHTIEN) {
        this.THANHTIEN = THANHTIEN;
    }

    public int getTRANGTHAI() {
        return TRANGTHAI;
    }

    public void setTRANGTHAI(int TRANGTHAI) {
        this.TRANGTHAI = TRANGTHAI;
    }

    public Date getNGAYTHANHTOAN() {
        return NGAYTHANHTOAN;
    }

    public void setNGAYTHANHTOAN(Date NGAYTHANHTOAN) {
        this.NGAYTHANHTOAN = NGAYTHANHTOAN;
    }

    @Override
    public String toString() {
        return "vPhieuHoaDon{" + "ID=" + ID + ", IDSP=" + IDSP + ", TENSP=" + TENSP + ", SIZE=" + SIZE + ", MAUSAC=" + MAUSAC + ", TENNGUOINHAN=" + TENNGUOINHAN + ", DIACHI=" + DIACHI + ", SDT=" + SDT + ", HINHANH=" + HINHANH + ", SoLuong=" + SoLuong + ", NGAYDATHANG=" + NGAYDATHANG + ", GIABAN=" + GIABAN + ", THANHTIEN=" + THANHTIEN + ", TRANGTHAI=" + TRANGTHAI + ", PHUOWNGTHUCTHANHTOAN=" + PHUOWNGTHUCTHANHTOAN + ", NGAYTHANHTOAN=" + NGAYTHANHTOAN + '}';
    }

   

}
