import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class db extends fs {
   private dg a;
   private ce a;
   private dc[] a;
   private int[] a;
   private String a;
   private cy a;
   private cx[] a;
   private String[] a;
   private boolean a;
   private cx a;
   private cx b;
   private int a;
   private dl a;
   private dl b;
   private int b = 124;
   private int c;
   private int d;
   private do a;

   public db(br var1, boolean var2) {
      super(true);
      this.c = bc.b - 30 - 30 - 15;
      this.d = bc.b - 30 - 15;
      this.a = var2;
      this.e = true;
      this.a = v.c();
      this.a = new dg(var1);
      this.a.b(15 + (64 - this.a.t) / 2, 57);
      this.a.a = false;
      this.a.h = false;
      this.b.a(this.a);
      if (var2) {
         this.a = new cy(15, 172, bc.b - 30, bc.c - 172 - 10 - gg.m, 30);
         this.a.e = new gq(4, "Thôi", this);
         this.a.d = new gq(5, "Dùng", this);
         this.a.c = new gq(11, "Tùy chọn", this);
      }

      this.n = j.e;
      db var7 = this;
      this.a = new dc[5];
      this.a = new int[5];

      for(int var9 = 0; var9 < 5; ++var9) {
         var7.a[var9] = new dc(var7, (byte)0);
      }

      var7.a[0] = 3;
      var7.a[1] = 2;
      var7.a[2] = 1;
      var7.a[3] = 104;
      var7.a[4] = 105;
      int[] var10 = new int[]{37, 16, 57, 16, 57};
      int[] var3 = new int[]{50, 90, 90, 120, 120};

      for(int var4 = 0; var4 < var7.a.length; ++var4) {
         var7.a[var4].a(var10[var4], var3[var4], 25, 25);
         if (var7.a) {
            var7.a[var4].d = new gq(0, "Đổi", new Integer(var4), var7);
         }

         var7.b.a(var7.a[var4]);
         var7.a[var4].b = var7;
      }

      var7.a[0].l();
      var7.b.b(var7.a);
      this.b = bc.c - 20 >> 1;
      Image var8 = null;

      try {
         var8 = Image.createImage("/pet/left.png");
      } catch (IOException var6) {
         var6.printStackTrace();
      }

      this.a = new dl(var8);
      this.a.a(this.c, this.b, 30, 20);
      this.a.a(new gq(17, "", this));
      Image var11 = null;

      try {
         var11 = Image.createImage("/pet/right.png");
      } catch (IOException var5) {
         var5.printStackTrace();
      }

      this.b = new dl(var11);
      this.b.a(this.d, this.b, 30, 20);
      this.b.a(new gq(18, "", this));
   }

   private dc a(int var1) {
      for(int var2 = 0; var2 < 5; ++var2) {
         if (this.a[var2] == var1) {
            return this.a[var2];
         }
      }

      return null;
   }

   public final void a() {
      bc.a.setColor(0);
      bc.a.fillRect(0, 0, bc.b, bc.c);
      br.a.a(this.a.l);
      gg.b(10, 20, bc.b - 20, 22);
      br.a(this.a.b, this.a.a, bc.b >> 1, 22);
      gg.b(10, 42, 80, 110);
      gg.b(90, 42, bc.b - 20 - 80, 110);
      int var1 = 47;
      int var2;
      if (this.a != null) {
         for(var2 = 0; var2 < this.a.length; ++var2) {
            gj.a.a(bc.a, this.a[var2], 95, var1, 0);
            var1 += gj.a.a() + 2;
         }

         if (!this.b.a) {
            v.e.a(bc.a, "Pet khác đang mặc", 95, var1, 0);
         }
      }

      if (this.b != null && this.b.a()) {
         gj.a.a(bc.a, "Đang tháo ngọc,", 95, var1, 0);
         var1 += gj.a.a() + 2;
         gj.a.a(bc.a, "còn " + au.b((long)this.b.a()), 95, var1, 0);
      }

      var1 = 25;
      gg.b(10, 152, bc.b - 20, bc.c - 152 - 5 - gg.m);
      if (this.a != null) {
         gj.a.a(bc.a, this.a, 25, 157, 20);
         var1 = 25 + gj.a.a(this.a);
      }

      if (this.a != null && this.a.a > 1) {
         var1 += 10;

         for(var2 = 0; var2 < this.a.a; ++var2) {
            if (var2 == this.a.b) {
               bc.a.setColor(16777215);
            } else {
               bc.a.setColor(10000536);
            }

            bc.a.fillArc(var1, 162, 5, 5, 0, 360);
            var1 += 10;
         }
      }

   }

   public final void a(Object var1) {
      gq var2;
      cx var8;
      if ((var2 = (gq)((Object[])var1)[0]) != null) {
         int var5;
         int var9;
         ez var11;
         Vector var12;
         fy var13;
         switch(var2.a) {
         case 0:
            switch((Integer)var2.a) {
            case 0:
               this.a = "Nón";
               this.f(3);
               return;
            case 1:
               this.a = "Giáp";
               this.f(2);
               return;
            case 2:
               this.a = "Vũ khí";
               this.f(1);
               return;
            case 3:
               this.a = "Giày";
               this.f(104);
               return;
            case 4:
               this.a = "Bao tay";
               this.f(105);
            default:
               return;
            }
         case 1:
         case 2:
         case 3:
         default:
            super.a(var1);
            return;
         case 4:
            this.b.b(this.a);
            this.b.b(this.b);
            this.a[0].l();
            this.b.b(this.a);
            return;
         case 5:
            if ((var13 = this.a.a(true)) != null && var13 != this.a) {
               var5 = ((cx)this.a.a(true)).a;
               (var11 = new ez(81)).a(29);
               var11.b(var5);
               eu.a.a(var11);
               var11.a();
               j.e_();
               return;
            }

            return;
         case 6:
            var5 = (Integer)var2.a;
            (var11 = new ez(81)).a(39);
            var11.b(var5);
            eu.a.a(var11);
            var11.a();
            j.e_();
            return;
         case 7:
            if ((var13 = this.a.a(true)) != null && var13 != this.a) {
               var8 = (cx)this.a.a(true);
               this.a(var8);
               return;
            }

            return;
         case 8:
            var8 = (cx)var2.a;
            var12 = new Vector();
            switch(var8.c) {
            case 0:
               var12.addElement(new gq(14, "Gắn ngọc", var8, this));
               break;
            case 1:
               var12.addElement(new gq(15, "Tháo ngọc", var8, this));
               break;
            case 2:
               var12.addElement(new gq(16, "Tháo ngọc nhanh", var8, this));
            }

            var12.addElement(new gq(6, "Tháo ra", new Integer(var8.a), this));
            var12.addElement(new gq(9, "Cường hóa", var8, this));
            var12.addElement(new gq(10, "Tiến hóa", var8, this));
            this.a(var12, 0);
            return;
         case 9:
            var8 = (cx)var2.a;
            this.a(var8);
            return;
         case 10:
            var8 = (cx)var2.a;
            this.b(var8);
            return;
         case 11:
            if ((var13 = this.a.a(true)) != null && var13 != this.a) {
               var8 = (cx)this.a.a(true);
               var12 = new Vector();
               switch(var8.c) {
               case 0:
                  var12.addElement(new gq(14, "Gắn ngọc", var8, this));
                  break;
               case 1:
                  var12.addElement(new gq(15, "Tháo ngọc", var8, this));
                  break;
               case 2:
                  var12.addElement(new gq(16, "Tháo ngọc nhanh", var8, this));
               }

               if (!var8.a) {
                  var12.addElement(new gq(6, "Tháo ra", new Integer(var8.a), this));
               }

               var12.addElement(new gq(7, "Cường hóa", var8, this));
               var12.addElement(new gq(12, "Tiến hóa", var8, this));
               var12.addElement(new gq(13, "Hủy", new Integer(var8.a), this));
               this.a(var12, 0);
               return;
            }

            return;
         case 12:
            if ((var13 = this.a.a(true)) != null && var13 != this.a) {
               var8 = (cx)this.a.a(true);
               this.b(var8);
               return;
            }

            return;
         case 13:
            Integer var7 = (Integer)var2.a;
            j.e_();
            var5 = var7;
            (var11 = new ez(81)).a(56);
            var11.b(var5);
            eu.a.a(var11);
            var11.a();
            return;
         case 14:
            var8 = (cx)var2.a;
            this.a = var8.a;
            j.e_();
            var5 = this.a;
            (var11 = new ez(81)).a(73);
            var11.b(var5);
            eu.a.a(var11);
            var11.a();
            return;
         case 15:
            var8 = (cx)var2.a;
            this.a = var8.a;
            j.e_();
            var5 = this.a;
            (var11 = new ez(81)).a(75);
            var11.b(var5);
            eu.a.a(var11);
            var11.a();
            return;
         case 16:
            var8 = (cx)var2.a;
            this.a = var8.a;
            j.e_();
            var5 = this.a;
            (var11 = new ez(81)).a(78);
            var11.b(var5);
            eu.a.a(var11);
            var11.a();
            return;
         case 17:
            var9 = this.a.b == 0 ? 0 : this.a.b - 1;
            this.a.a(var9);
            return;
         case 18:
            var9 = this.a.b == this.a.a - 1 ? this.a.a - 1 : this.a.b + 1;
            this.a.a(var9);
         }
      } else {
         fy var4 = (fy)((Object[])var1)[1];
         boolean var6 = false;

         int var3;
         for(var3 = 0; var3 < 5; ++var3) {
            if (var4 == this.a[var3]) {
               var6 = true;
               break;
            }
         }

         this.a = null;
         this.b = null;
         if (var6) {
            dc var10;
            if ((var10 = (dc)var4).a != null) {
               if (var10.a.c != null) {
                  this.a = gj.a.a(var10.a.c, bc.b - 100 - 10);
               }

               this.b = var10.a;
            }

         } else {
            for(var3 = 0; var3 < this.a.length; ++var3) {
               if (var4 == this.a[var3]) {
                  if ((var8 = (cx)var4).c != null) {
                     this.a = gj.a.a(var8.c, bc.b - 100 - 10);
                  }

                  this.b = var8;
               }
            }

         }
      }
   }

   private void h() {
      int var1;
      for(var1 = 0; var1 < 5; ++var1) {
         this.a[var1].c = null;
         this.a[var1].a = null;
      }

      for(var1 = 0; var1 < this.a.length; ++var1) {
         if (this.a[var1].n == this.a.a) {
            dc var2;
            (var2 = this.a(this.a[var1].b)).a = this.a[var1];
            var2.c = new gq(8, "Tùy chọn", this.a[var1], this);
         }
      }

   }

   public final void a(ce var1, cx[] var2) {
      this.a.a(var1);
      this.a = var1;
      this.a = var2;

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         this.a[var3].b = this;
      }

      this.h();
   }

   private void f(int var1) {
      this.b.b(this.a);
      this.b.b(this.b);
      int var2 = 0;

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (b(this.a[var3].b, var1) && this.a[var3].n != this.a.a) {
            ++var2;
         }
      }

      if (var2 != 0) {
         cx[] var5 = new cx[var2];
         var2 = 0;

         for(int var4 = 0; var4 < this.a.length; ++var4) {
            if (b(this.a[var4].b, var1) && this.a[var4].n != this.a.a) {
               var5[var2] = this.a[var4];
               if (this.a[var4].n != 0 && this.a[var4].n != -1) {
                  var5[var2].a = false;
               } else {
                  var5[var2].a = true;
               }

               ++var2;
            }
         }

         this.a.a(var5);
         this.a.a(0);
         if (this.a.a > 1) {
            this.b.a(this.a);
            this.b.a(this.b);
         }
      } else {
         fn var6;
         (var6 = new fn("Không có item nào.", gj.a)).h = false;
         this.a.m();
         this.a.a(var6);
      }

      this.b.a(this.a);
   }

   public final void a(int var1) {
      fs.b(fs.a);
      cx var2 = null;

      int var3;
      for(var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3].a == var1) {
            var2 = this.a[var3];
            break;
         }
      }

      if (var2 != null) {
         var2.n = this.a.a;
         var3 = -1;
         dc var4;
         if ((var4 = this.a(var2.b)).a != null) {
            var3 = var4.a.a;
         }

         for(var1 = 0; var1 < this.a.length; ++var1) {
            if (var3 == this.a[var1].a) {
               this.a[var1].n = 0;
               break;
            }
         }

         this.h();
         this.a.m();
         this.a[0].l();
         this.b.b(this.a);
      }
   }

   public final void b(int var1) {
      fs.b(fs.a);
      cx var2 = null;

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3].a == var1) {
            var2 = this.a[var3];
            break;
         }
      }

      if (var2 != null) {
         var2.n = 0;
         this.h();
         this.a.m();
         this.a[0].l();
         this.b.b(this.a);
      }
   }

   private void a(cx var1) {
      this.a = new do(0);
      this.a.a(0, var1.a, var1.b, var1.c, var1.b);
      this.a(this.a, false);
      this.a = var1;
   }

   public final void a(ez var1) {
      if (this.a != null) {
         int var2 = var1.a().readInt();
         String var3 = var1.a().readUTF();
         String var4 = var1.a().readUTF();
         int var5 = var1.a().readInt();
         if (this.a.a == 0) {
            this.a.a(var5 - 6, var2, var3, var4, (byte)0);
         } else {
            this.a.a(1, var2, var3, var4, (byte)0);
         }

         this.a(this.a, true);
      }
   }

   public final void b(ez var1) {
      byte var2 = var1.a().readByte();
      int var3 = var1.a().readInt();
      String var4 = var1.a().readUTF();
      String var5 = var1.a().readUTF();
      String var6 = var1.a().readUTF();
      int var7 = var1.a().readInt();
      int var8 = var1.a().readInt();
      int var9 = var1.a().readInt();
      int var10 = var1.a().readInt();
      int var11 = var1.a().readInt();
      int var12 = var1.a().readInt();
      int var13 = var1.a().readInt();
      byte var14 = var1.a().readByte();
      byte var18 = var1.a().readByte();
      int var17;
      cx var22;
      if (this.a.a == 0) {
         if (var2 != -1) {
            for(int var20 = 0; var20 < this.a.length; ++var20) {
               if (this.a[var20].a == var3) {
                  this.a[var20].c = var5;
                  this.a[var20].a = var6;
                  this.a[var20].g = var7;
                  this.a[var20].h = var8;
                  this.a[var20].i = var9;
                  this.a[var20].j = var10;
                  this.a[var20].k = var11;
                  this.a[var20].l = var12;
                  this.a[var20].m = var13;
                  this.a[var20].a = var14;
                  this.a[var20].a(var18);
                  break;
               }
            }
         } else {
            cx[] var15 = new cx[this.a.length - 1];
            int var16 = 0;

            for(var17 = 0; var17 < this.a.length; ++var17) {
               if (this.a[var17].a != var3) {
                  var15[var16++] = this.a[var17];
               }
            }

            this.a = new cx[var15.length];
            System.arraycopy(var15, 0, this.a, 0, this.a.length);
            this.a[0].l();
            this.b.b(this.a);
         }

         this.a[0].l();
      } else {
         cx var21 = null;
         var22 = null;

         for(var17 = 0; var17 < this.a.length; ++var17) {
            if (this.a[var17].a == this.a.a[0]) {
               var21 = this.a[var17];
            }

            if (this.a[var17].a == this.a.a[1]) {
               var22 = this.a[var17];
            }
         }

         for(var17 = 0; var17 < 5; ++var17) {
            if (var21 != null && this.a[var17].a != null && this.a[var17].a.a == var21.a || var22 != null && this.a[var17].a != null && this.a[var17].a.a == var22.a) {
               this.a[var17].a = null;
               this.a[var17].c = null;
            }
         }

         cx var24;
         (var24 = new cx()).a(this.a);
         var24.a = var3;
         var24.b = var4;
         var24.c = var5;
         var24.a = var6;
         var24.g = var7;
         var24.h = var8;
         var24.i = var9;
         var24.j = var10;
         var24.k = var11;
         var24.l = var12;
         var24.m = var13;
         var24.a = var14;
         var24.n = 0;
         var24.b = this;
         var24.a(var18);
         cx[] var19 = new cx[this.a.length - 1];
         var7 = 0;

         for(var8 = 0; var8 < this.a.length; ++var8) {
            if (this.a[var8].a != this.a.a[0] && this.a[var8].a != this.a.a[1]) {
               var19[var7++] = this.a[var8];
            }
         }

         var19[var7] = var24;
         this.a = new cx[var19.length];
         System.arraycopy(var19, 0, this.a, 0, this.a.length);
         this.a[0].l();
         this.b.b(this.a);
      }

      this.w();
      dp var23 = new dp(var2 == 1, 30);
      (var22 = new cx()).a = var3;
      var22.b = var4;
      var22.a(var18);
      var23.a(var22, var5);
      this.a(var23, false);
   }

   private void b(cx var1) {
      this.a = new do(1);
      this.a.a(0, var1.a, var1.b, var1.c, var1.b);
      this.a(this.a, false);
      this.a = var1;
   }

   public final void c(int var1) {
      fs.b(fs.a);
      boolean var2 = false;
      cx[] var3 = new cx[this.a.length];
      int var4 = 0;

      for(int var5 = 0; var5 < this.a.length; ++var5) {
         if (this.a[var5].a != var1) {
            var3[var4++] = this.a[var5];
         } else {
            var2 = true;
         }
      }

      if (var2) {
         this.a = new cx[var3.length - 1];
         System.arraycopy(var3, 0, this.a, 0, this.a.length);
      }

      this.a[0].l();
      this.b.b(this.a);
   }

   public final void c(ez var1) {
      int var2 = var1.a().readInt();

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3].a == var2) {
            this.a[var3].b = var1.a().readUTF();
            this.a[var3].a = var1.a().readUTF();
            this.a[var3].c = var1.a().readUTF();
            this.a[var3].b = var1.a().readInt();
            this.a[var3].n = var1.a().readInt();
            this.a[var3].c = var1.a().readInt();
            this.a[var3].d = var1.a().readInt();
            this.a[var3].e = var1.a().readInt();
            this.a[var3].f = var1.a().readInt();
            this.a[var3].g = var1.a().readInt();
            this.a[var3].h = var1.a().readInt();
            this.a[var3].i = var1.a().readInt();
            this.a[var3].j = var1.a().readInt();
            this.a[var3].k = var1.a().readInt();
            this.a[var3].l = var1.a().readInt();
            this.a[var3].m = var1.a().readInt();
            this.a[var3].a = var1.a().readByte();
            this.a[var3].a(var1.a().readByte());
            this.a[var3].c = 1;
            break;
         }
      }

      this.a[0].l();
   }

   private void c(cx var1) {
      if (this.b == var1 && this.b.c != null) {
         this.a = gj.a.a(this.b.c, bc.b - 100 - 10);
      }

   }

   public final void d(ez var1) {
      int var2 = var1.a().readInt();

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3].a == var2) {
            this.a[var3].b = var1.a().readUTF();
            this.a[var3].a = var1.a().readUTF();
            this.a[var3].c = var1.a().readUTF();
            this.a[var3].b = var1.a().readInt();
            this.a[var3].n = var1.a().readInt();
            this.a[var3].c = var1.a().readInt();
            this.a[var3].d = var1.a().readInt();
            this.a[var3].e = var1.a().readInt();
            this.a[var3].f = var1.a().readInt();
            this.a[var3].g = var1.a().readInt();
            this.a[var3].h = var1.a().readInt();
            this.a[var3].i = var1.a().readInt();
            this.a[var3].j = var1.a().readInt();
            this.a[var3].k = var1.a().readInt();
            this.a[var3].l = var1.a().readInt();
            this.a[var3].m = var1.a().readInt();
            this.a[var3].a = var1.a().readByte();
            this.a[var3].a(var1.a().readByte());
            this.a[var3].c = 2;
            var1.a().readLong();
            this.a[var3].o = var1.a().readInt();
            this.a[var3].a = System.currentTimeMillis();
            this.c(this.a[var3]);
            break;
         }
      }

      this.a[0].l();
   }

   private static boolean b(int var0, int var1) {
      return var0 == var1 || var0 == var1 + 100;
   }

   public final void e(ez var1) {
      int var2 = var1.a().readInt();
      fs.b(fs.a);

      for(int var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3].a == var2) {
            cx var10 = this.a[var3];
            var10.b = var1.a().readUTF();
            var10.a = var1.a().readUTF();
            var10.c = var1.a().readUTF();
            var10.b = var1.a().readInt();
            var10.n = var1.a().readInt();
            var10.c = var1.a().readInt();
            var10.d = var1.a().readInt();
            var10.e = var1.a().readInt();
            var10.f = var1.a().readInt();
            var10.g = var1.a().readInt();
            var10.h = var1.a().readInt();
            var10.i = var1.a().readInt();
            var10.j = var1.a().readInt();
            var10.k = var1.a().readInt();
            var10.l = var1.a().readInt();
            var10.m = var1.a().readInt();
            var10.a = var1.a().readByte();
            var10.a(var1.a().readByte());
            if (var1.a().readBoolean()) {
               long var8 = var1.a().readLong();
               var10.o = var1.a().readInt();
               if (var8 > 0L) {
                  var10.c = 2;
                  var10.a = System.currentTimeMillis();
               } else {
                  var10.c = 1;
               }
            } else {
               var10.c = 0;
            }

            this.c(var10);
            return;
         }
      }

   }
}
