import java.io.DataInputStream;

public final class at extends dz implements go {
   private eg a;
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;
   private int f;
   private int g = 0;
   private int h = 1;
   private long a = System.currentTimeMillis();

   public at() {
   }

   public static at a(eg var0, DataInputStream var1) {
      try {
         byte var2 = var1.readByte();
         byte var3 = var1.readByte();
         short var4 = var1.readShort();
         short var5 = var1.readShort();
         byte var6 = var1.readByte();
         byte var7 = var1.readByte();
         byte var8 = var1.readByte();
         byte var9 = var1.readByte();
         byte var10 = var1.readByte();
         byte var11 = -1;
         byte var12 = 0;
         String var13 = "";
         byte var14 = 0;
         if (var2 != 0) {
            var3 = -1;
            var11 = var1.readByte();
            var12 = var1.readByte();
            var13 = var1.readUTF();
            var14 = var1.readByte();
         }

         return new at(var0, var4, var5, var6, var7, var8, var9, var10, var3, var11, var12, var13, var14);
      } catch (Exception var15) {
         var15.printStackTrace();
         return null;
      }
   }

   private at(eg var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9, int var10, int var11, String var12, int var13) {
      this.a = var1;
      this.a = var9;
      at var10000;
      String var10001;
      if (this.a == -1) {
         this.g = true;
         var10000 = this;
         var10001 = var12;
      } else {
         var10000 = this;
         switch(this.a) {
         case 0:
            var10001 = "Nhà hẻm";
            break;
         case 1:
            var10001 = "Nhà mặt tiền";
            break;
         case 2:
            var10001 = "Biệt thự";
            break;
         case 3:
            var10001 = "Dinh thự";
            break;
         case 4:
            var10001 = "Nhà";
            break;
         case 5:
         default:
            var10001 = "";
            break;
         case 6:
            var10001 = "Thú cưng";
            break;
         case 7:
            var10001 = "Vườn";
            break;
         case 8:
            var10001 = "Phòng vé";
            break;
         case 9:
            var10001 = "";
            break;
         case 10:
            var10001 = "Cà phê";
            break;
         case 11:
            var10001 = "Khu";
            break;
         case 12:
            var10001 = "Hộp thư";
            break;
         case 13:
            var10001 = "Caro";
            break;
         case 14:
            var10001 = "Cờ tướng";
            break;
         case 15:
            var10001 = "Tiến lên";
            break;
         case 16:
            var10001 = "Phỏm";
            break;
         case 17:
            var10001 = "Thời trang";
            break;
         case 18:
            var10001 = "Nón";
            break;
         case 19:
            var10001 = "Giày";
            break;
         case 20:
            var10001 = "Mỹ viện";
            break;
         case 21:
            var10001 = "Tóc";
            break;
         case 22:
            var10001 = "Vật phẩm";
            break;
         case 23:
            var10001 = "Gara";
            break;
         case 24:
            var10001 = "Trò chơi trong nhà";
            break;
         case 25:
            var10001 = "Pet shop";
            break;
         case 26:
            var10001 = "Đấu trường";
            break;
         case 27:
            var10001 = "";
            break;
         case 28:
            var10001 = "";
            break;
         case 29:
            var10001 = "";
            break;
         case 30:
            var10001 = "";
            break;
         case 31:
            var10001 = "";
            break;
         case 32:
            var10001 = "";
         }
      }

      var10000.d = var10001;
      this.m = var2;
      this.n = var3;
      this.f = var4;
      this.b = var7;
      this.c = var8;
      this.d = var10;
      this.e = var11;
      this.a(new gn(var5, var6, this.b, this.c));
      this.a = new gq("Chọn", this);
   }

   public final void a(int var1, int var2) {
      long var3;
      if ((var3 = System.currentTimeMillis()) - this.a > 50L) {
         this.a = var3;
         this.g += this.h;
         if (this.g < -1 || this.g > 2) {
            this.h = -this.h;
         }
      }

      var2 = -var2 + this.n - this.f - v.i.getHeight() - this.q;
      if (this.a == -1) {
         v.c().a(bc.a, this.d, this.m - var1, var2 + 20, 3);
      } else {
         v.c().a(bc.a, this.d, this.m - var1, var2 - 23, 3);
      }
   }

   public final void b(int var1, int var2) {
      long var3;
      if ((var3 = System.currentTimeMillis()) - this.a > 50L) {
         this.a = var3;
         this.g += this.h;
         if (this.g < -1 || this.g > 2) {
            this.h = -this.h;
         }
      }

      if (this.a != -1) {
         var2 = -var2 + this.n - this.f - v.i.getHeight() - this.q;
         bc.a.drawImage(v.i, this.m - var1, var2, 17);
      }

   }

   public final void a(Object var1) {
      ez var4;
      switch(this.a) {
      case -1:
         eg.a(this.d, this.e, ed.a(this.d));
         return;
      case 0:
         this.a.a(new Object[]{new gq(2, "", this.a)});
         return;
      case 1:
         this.a.a(new Object[]{new gq(3, "", this.a)});
         return;
      case 2:
         this.a.a(new Object[]{new gq(4, "", this.a)});
         return;
      case 3:
         this.a.a(new Object[]{new gq(5, "", this.a)});
         return;
      case 4:
         this.a.a(new Object[]{new gq(502, "", this.a)});
         return;
      case 7:
         this.a.a(new Object[]{new gq(10, "", this.a)});
         return;
      case 8:
         eg var10000 = this.a;
         eg.a(this, new fy[]{new fn(c.a(574)), new ff(new gq(1202, c.a(134), this.a)), new ff(new gq(1203, c.a(471), this.a))});
         return;
      case 9:
         j.a.a((Object)(new Object[]{new gq(18, "", j.a)}));
         return;
      case 10:
         this.a.a(new Object[]{new gq(2019, "", this.a)});
         return;
      case 11:
         this.a.a(new Object[]{new gq(1103, "", this.a)});
         return;
      case 12:
         this.a.a(new Object[]{new gq(2020, "", this.a)});
         return;
      case 13:
         this.a.a(new Object[]{new gq(602, "", this.a)});
         return;
      case 14:
         this.a.a(new Object[]{new gq(603, "", this.a)});
         return;
      case 15:
         this.a.a(new Object[]{new gq(606, "", this.a)});
         return;
      case 16:
         this.a.a(new Object[]{new gq(607, "", this.a)});
         return;
      case 17:
         j.e_();
         (var4 = new ez(81)).a(60);
         eu.a.a(var4);
         var4.a();
         return;
      case 18:
         this.a.a(new Object[]{new gq(1003, "", this.a)});
         return;
      case 19:
         this.a.a(new Object[]{new gq(1004, "", this.a)});
         return;
      case 20:
         this.a.a(new Object[]{new gq(1005, "", this.a)});
         return;
      case 21:
         this.a.a(new Object[]{new gq(1006, "", this.a)});
         return;
      case 22:
         this.a.a(new Object[]{new gq(1009, "", this.a)});
         return;
      case 23:
         this.a.a(new Object[]{new gq(1008, "", this.a)});
         return;
      case 26:
         j.e_();
         boolean var5 = false;
         (var4 = new ez(81)).a(58);
         var4.a(0);
         eu.a.a(var4);
         var4.a();
         return;
      case 27:
         j.e_();
         bf.d(1);
         return;
      case 28:
         j.e_();
         bf.d(2);
         return;
      case 29:
         j.e_();
         bf.d(3);
         return;
      case 30:
         j.e_();
         bf.d(4);
         return;
      case 31:
         j.e_();
         (var4 = new ez(81)).a(21);
         eu.a.a(var4);
         var4.a();
      case 5:
      case 6:
      case 24:
      case 25:
      default:
         return;
      case 32:
         br var3;
         if ((var3 = (br)en.a().a).a == null) {
            j.a_("Bạn không dẫn theo pet");
         } else {
            br.a = 1;
            j.e_();
            bf.b(var3.a.b);
         }
      }
   }
}
