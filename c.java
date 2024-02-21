import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Vector;
import javax.microedition.rms.RecordStore;

public class c {
   public short[] a;
   public short[] b;
   public short[] c;
   public short[] d;
   public int[] a;
   public int[] b;
   public int[] c;
   public int[] d;
   public short[] e;
   short[] f;
   boolean a;
   Vector a = new Vector();

   protected c(boolean var1) {
      this.a = var1;
   }

   public static c a(String var0, boolean var1, d var2) {
      if (var2 == null) {
         throw new IllegalArgumentException("Image Loader cannot be null");
      } else {
         c var11 = new c(false);
         DataInputStream var12 = new DataInputStream((new String()).getClass().getResourceAsStream(var0));

         short[] var9;
         short[] var10;
         int[] var20;
         short[] var21;
         int[] var22;
         short[] var23;
         short[] var25;
         short[] var27;
         int[] var31;
         int[] var32;
         try {
            var12.readShort();
            var12.readUTF();
            byte var3;
            var21 = new short[(var3 = var12.readByte()) << 1];

            for(int var4 = 0; var4 < var3; ++var4) {
               var21[2 * var4] = var12.readShort();
               var21[2 * var4 + 1] = var12.readShort();
            }

            short var24;
            var23 = new short[(var24 = var12.readShort()) << 2];

            for(int var5 = 0; var5 < var24; ++var5) {
               var23[4 * var5] = var12.readShort();
               var23[4 * var5 + 1] = (short)var12.readByte();
               var23[4 * var5 + 2] = var12.readShort();
               var23[4 * var5 + 3] = var12.readShort();
            }

            var25 = new short[var12.readShort()];
            short var26 = var12.readShort();
            short var6 = 0;
            var9 = new short[var26 << 1];

            int var7;
            int var13;
            for(var7 = 0; var7 < var26; ++var7) {
               var9[2 * var7] = var6;
               short var8 = var12.readShort();

               for(var13 = 0; var13 < var8; ++var13) {
                  var25[var6++] = var12.readShort();
                  var25[var6++] = var12.readShort();
                  var25[var6++] = var12.readShort();
                  var25[var6++] = (short)var12.readByte();
               }

               var9[2 * var7 + 1] = (short)(var6 - 1);
            }

            short var28 = var12.readShort();
            byte var29 = var12.readByte();
            var27 = new short[var28 << 2];
            var6 = 0;
            var10 = new short[var29];
            short var33 = 0;

            short var14;
            int var15;
            for(var7 = 0; var7 < var29; ++var7) {
               var10[var7] = var33;
               var14 = var12.readShort();

               for(var15 = 0; var15 < var14; ++var15) {
                  var27[var6++] = var12.readShort();
                  var27[var6++] = var12.readShort();
                  var27[var6++] = var12.readShort();
                  var27[var6++] = var12.readShort();
               }

               var33 += var14;
               var11.a.addElement(var2.a(var0));
            }

            var20 = new int[(var28 = var12.readShort()) * 5];

            int var34;
            for(var34 = 0; var34 < var28; ++var34) {
               var20[5 * var34] = var12.readShort();
               var20[5 * var34 + 1] = var12.readShort();
               var20[5 * var34 + 2] = var12.readShort();
               var20[5 * var34 + 3] = var12.readShort();
               var20[5 * var34 + 4] = var12.readInt();
            }

            var22 = new int[(var14 = var12.readShort()) * 3];

            for(var7 = 0; var7 < var14; ++var7) {
               var22[3 * var7] = var12.readShort();
               var22[3 * var7 + 1] = var12.readShort();
               var22[3 * var7 + 2] = var12.readInt();
            }

            var31 = new int[(var28 = var12.readShort()) * 3];
            var15 = 0;

            label179:
            while(true) {
               if (var15 >= var28) {
                  short var35;
                  var32 = new int[(var35 = var12.readShort()) * 5];

                  for(var13 = 0; var13 < var35; ++var13) {
                     var32[5 * var13] = var12.readShort();
                     var32[5 * var13 + 1] = var12.readShort();
                     var32[5 * var13 + 2] = var12.readShort();
                     var32[5 * var13 + 3] = var12.readShort();
                     var32[5 * var13 + 4] = var12.readInt();
                  }

                  short[] var30 = new short[(var33 = var12.readShort()) << 1];
                  var34 = 0;

                  while(true) {
                     if (var34 >= var33) {
                        break label179;
                     }

                     var30[2 * var34] = var12.readShort();
                     var30[2 * var34 + 1] = var12.readShort();
                     ++var34;
                  }
               }

               var31[3 * var15] = var12.readShort();
               var31[3 * var15 + 1] = var12.readShort();
               var31[3 * var15 + 2] = var12.readInt();
               ++var15;
            }
         } catch (Exception var18) {
            throw var18;
         } finally {
            var12.close();
         }

         var11.a = var21;
         var11.b = var23;
         var11.f = var9;
         var11.c = var25;
         var11.d = var27;
         var11.a = var20;
         var11.b = var22;
         var11.c = var31;
         var11.d = var32;
         var11.e = var10;
         return var11;
      }
   }

   public static String a(int var0) {
      switch(var0) {
      case 3:
         return "Tiện ích";
      case 4:
         return "Chấp nhận";
      case 5:
         return "T.Khoản";
      case 9:
         return "Thêm bạn";
      case 18:
         return "Nhiệm vụ";
      case 21:
         return "Quay lại";
      case 24:
         return "Ngân hàng";
      case 25:
         return "Đậu";
      case 30:
         return "Game cần mở trình duyệt web. Hãy thoát game nếu như không thấy hiển thị trang web.";
      case 40:
         return "Gọi trợ giúp";
      case 41:
         return "Thôi";
      case 46:
         return "Không thể gởi tin nhắn đăng ký. Xin kiểm tra tiền và thử khởi động lại game.";
      case 51:
         return "Đổi";
      case 55:
         return "Nạp";
      case 58:
         return "Chat";
      case 63:
         return "Xóa dữ liệu";
      case 64:
         return "Đóng";
      case 73:
         return "Bạn muốn xoá dữ liệu?";
      case 77:
         return "Bạn muốn thoát?";
      case 82:
         return "Kết nối thất bại. Xin kiểm tra lại GPRS, 3G, Wifi hoặc cập nhật lại máy chủ.";
      case 83:
         return "Đang kết nối...";
      case 87:
         return "Tiếp tục";
      case 93:
         return "ngày";
      case 94:
         return "Xóa hết";
      case 95:
         return "Xóa";
      case 101:
         return "Từ chối";
      case 103:
         return "Hủy";
      case 116:
         return "Tải";
      case 123:
         return "Cảm xúc";
      case 129:
         return "English";
      case 130:
         return "Nhập tên nhân vật";
      case 132:
         return "Vui lòng nhập Nick ID muốn đăng ký vào ô trên.";
      case 133:
         return "Bạn phải nhập password đăng ký.";
      case 134:
         return "Khu giải trí";
      case 138:
         return "Sự kiện";
      case 139:
         return "Thoát";
      case 140:
         return "Kb, bạn có muốn thoát khỏi ứng dụng không?";
      case 154:
         return "Quên mật khẩu";
      case 159:
         return "Bạn bè";
      case 167:
         return "đã được người khác sử dụng. Xin chọn tên khác.";
      case 174:
         return "Bạn phải dùng số điện thoại đăng ký nick để lấy mật khẩu.";
      case 178:
         return "Tên muốn lấy mật khẩu không được rỗng!";
      case 184:
         return "mGold";
      case 185:
         return "Đổi vàng lấy đậu";
      case 186:
         return "Đổi vàng lấy thóc";
      case 189:
         return "Đến khu số";
      case 203:
         return "Bạn có tin nhắn mới.";
      case 205:
         return "Hỗ trợ";
      case 209:
         return "giờ";
      case 212:
         return "Bạn phải có 1 mã số để nạp.";
      case 213:
         return "Bạn phải có thẻ cào có 2 mã số để nạp.";
      case 220:
         return "Thông tin";
      case 221:
         return "vào danh sách bạn bè?";
      case 222:
         return "Giới thiệu";
      case 223:
         return "Không thể lấy thông tin\nVui lòng xem thông tin tại đia chỉ\nhttp://mgo.vn.";
      case 231:
         return "Vào";
      case 247:
         return "Ngôn ngữ";
      case 249:
         return "Quy định";
      case 265:
         return "Đang đăng nhập...";
      case 266:
         return "Đăng nhập";
      case 267:
         return "Đăng xuất";
      case 275:
         return "Menu";
      case 276:
         return "Tin nhắn";
      case 278:
         return "phút";
      case 284:
         return "Di chuyển";
      case 291:
         return "Bạn cần có ít nhất 1000 đồng trong tài khoản chính để lấy mật khẩu.";
      case 298:
         return "Tên";
      case 299:
         return "Chuyển cho";
      case 300:
         return "Không";
      case 307:
         return "Bạn không có tin nhắn mới.";
      case 322:
         return "Password bạn vừa gõ không khớp với password phía trên.";
      case 330:
         return "Nếu chưa có tên,";
      case 331:
         return "Nếu chưa có tên, xin đăng ký";
      case 337:
         return "OK";
      case 344:
         return "Hoặc soạn tin nhắn ";
      case 348:
         return "M.Kh:";
      case 350:
         return "Thành công, xin vui lòng chờ hệ thống gởi tin nhắn mật khẩu mới cho bạn";
      case 352:
         return "Xin chờ...";
      case 353:
         return "\nBản quyền 2011 ME Corp.\nGiấy phép cung cấp MXH số 35/GXN-TTĐT. Cấp ngày 06/05/2011.";
      case 356:
         return "Số điện thoại này có phải là số dùng để đăng ký nick không?";
      case 362:
         return "xin đăng ký.";
      case 363:
         return "Xin chờ";
      case 364:
         return "Trước";
      case 371:
         return "Tên chương trình";
      case 375:
         return "Mật khẩu";
      case 376:
         return "Số lượng";
      case 384:
         return "Khu vực";
      case 385:
         return "Đăng ký";
      case 386:
         return "Đang đăng ký...";
      case 387:
         return "Đã gửi thông tin đăng ký thành công. Xin thoát game và chờ giây lát.";
      case 390:
         return "Xóa bộ nhớ tạm thành công.";
      case 391:
         return "Thông báo";
      case 393:
         return "Tên không được trống.";
      case 394:
         return "Mật khẩu không được rỗng.";
      case 397:
         return "Nhập lại";
      case 400:
         return "Thóc";
      case 419:
         return "Chọn";
      case 422:
         return "Chọn nhân vật";
      case 428:
         return "Chọn máy chủ";
      case 435:
         return "Đang gửi tin nhắn...";
      case 439:
         return "Không thể gởi tin nhắn nạp tiền. Xin kiểm tra tiền và thử khởi động lại game.";
      case 440:
         return "Đã nạp tiền xong. Xin chờ tin nhắn xác nhận. Lưu ý bạn chỉ nạp được 3 lần trong 5 phút.";
      case 441:
         return " Gửi tới ";
      case 459:
         return "Cấu hình";
      case 471:
         return "Khu mua sắm";
      case 473:
         return "Chưa hoàn thành nhập";
      case 482:
         return "Gõ lại";
      case 488:
         return "Nhớ thông tin";
      case 491:
         return "Thành công!";
      case 495:
         return "Góp ý";
      case 496:
         return "Không hỗ trợ phương thức này.";
      case 503:
         return "Tặng bạn bè";
      case 504:
         return "Cảm ơn bạn đã góp ý!";
      case 519:
         return "Nhập tên cần lấy lại mật khẩu";
      case 532:
         return "Tặng mGold";
      case 548:
         return "Cập nhật";
      case 552:
         return "Kết nối thất bại. Bạn có muốn cập nhật thông tin máy chủ không?";
      case 553:
         return "Không thể cập nhật danh sách máy chủ. Mời bạn thử lại sau";
      case 557:
         return "Phiên bản";
      case 558:
         return "Rung";
      case 559:
         return "Tiếng Việt";
      case 560:
         return "Xem";
      case 574:
         return "Bạn muốn đi đâu?";
      case 580:
         return "Có";
      case 595:
         return "của bạn";
      case 596:
         return "mGold hiện tại của bạn";
      case 604:
         return "Bạn đã dùng ";
      case 611:
         return "Chế độ rung";
      case 664:
         return "Sau";
      case 666:
         return "KHU VỰC";
      case 667:
         return "Thách đấu";
      case 668:
         return "Chuyển map";
      case 670:
         return "Trò chơi trong nhà";
      case 671:
         return "Thú cưng";
      default:
         return String.valueOf(var0);
      }
   }

   public static ds a(int var0, byte var1, eg var2) {
      return new bq(var0, var1, var2);
   }

   public static byte[] a(String var0, int var1) {
      RecordStore var11 = null;

      try {
         byte[] var10 = (var11 = RecordStore.openRecordStore(var0, false)).getRecord(1);
         return var10;
      } catch (Exception var8) {
      } finally {
         if (var11 != null) {
            try {
               var11.closeRecordStore();
            } catch (Exception var7) {
            }
         }

      }

      return null;
   }

   public static void a(String var0, byte[] var1) {
      RecordStore var2;
      if ((var2 = RecordStore.openRecordStore(var0, true)).getNumRecords() > 0) {
         var2.setRecord(1, var1, 0, var1.length);
      } else {
         var2.addRecord(var1, 0, var1.length);
      }

      var2.closeRecordStore();
   }

   public static void a(String var0, String var1) {
      try {
         a(var0, var1.getBytes("UTF-8"));
      } catch (Exception var2) {
      }
   }

   public static String a(String var0) {
      byte[] var2;
      if ((var2 = a(var0, 1)) == null) {
         return null;
      } else {
         try {
            return new String(var2, "UTF-8");
         } catch (Exception var1) {
            return new String(var2);
         }
      }
   }

   public static void a(String var0, int var1) {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      DataOutputStream var3 = new DataOutputStream(var2);

      try {
         var3.writeInt(var1);
         a(var0, var2.toByteArray());
         return;
      } catch (Exception var10) {
      } finally {
         try {
            var3.close();
         } catch (Exception var9) {
         }

      }

   }

   public static Integer a(String var0) {
      byte[] var10;
      if ((var10 = a(var0, 1)) != null) {
         DataInputStream var11 = new DataInputStream(new ByteArrayInputStream(var10));

         try {
            int var1 = var11.readInt();
            return new Integer(var1);
         } catch (Exception var8) {
         } finally {
            try {
               var11.close();
            } catch (Exception var7) {
            }

         }

         return null;
      } else {
         return null;
      }
   }

   public static void a(String var0) {
      try {
         RecordStore.deleteRecordStore(var0);
      } catch (Exception var1) {
      }
   }

   public static void a() {
      String[] var0;
      if ((var0 = RecordStore.listRecordStores()) != null) {
         for(int var1 = 0; var1 < var0.length; ++var1) {
            try {
               RecordStore.deleteRecordStore(var0[var1]);
            } catch (Exception var2) {
            }
         }

      }
   }
}
