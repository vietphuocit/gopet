import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class cs extends ag {
   public int b;
   private int c;
   private String a;
   private boolean a;
   private String b;
   private byte b;
   private byte c;
   private Image a;
   private String e;
   private Object a;

   public cs() {
      this.c = "SCREEN_GUILD";
      this.d = "Bang hội";
      this.e = true;
      this.a = v.c();
      this.n = j.e;
   }

   private h a() {
      fy var1;
      return (var1 = this.a.a(true)) != null ? (h)var1 : null;
   }

   public final void a() {
      super.a();
      int var5;
      if ((this.b & 2) != 0) {
         byte var6 = 20;
         gg.b(10, 20, bc.b - 20, 22);
         br.a("Thông tin chung", 2, bc.b >> 1, 22);
         var5 = var6 + 30;
         gg.b(10, 50, bc.b - 20, bc.c - 50 - 25);
         String[] var7 = (String[])this.a;

         for(int var9 = 0; var9 < var7.length; ++var9) {
            var5 += gj.a.b + 4;
            gj.a.a(bc.a, "(str) " + var7[var9], 20, var5, 0);
         }

      } else {
         if ((this.b & 32) != 0) {
            String var1 = "(str)Đóng đóng góp: 0";
            String var2 = "(str)Điểm vinh dự: 0";
            Object[] var3;
            String var4 = (var3 = (Object[])this.a)[0].toString();
            String[] var8 = var3[1] != null ? (String[])var3[1] : null;
            bc.a.setColor(0);
            bc.a.fillRect(0, 0, bc.b, bc.c);
            gg.b(10, 20, bc.b - 20, 22);
            br.a(var4, 2, bc.b >> 1, 22);
            gg.b(10, 42, 64, 80);
            gg.b(74, 42, bc.b - 20 - 64, 80);
            byte var10 = 50;
            gj.a.a(bc.a, var8 == null ? var2 : var8[0], 90, 50, 0);
            int var11 = var10 + 18;
            gj.a.a(bc.a, var8 == null ? var1 : var8[1], 90, 68, 0);
            gg.b(10, 122, bc.b - 20, bc.c - 122 - 5 - gg.m);
            if (this.a == null) {
               this.a = v.a(this.e, (byte)3);
            }

            var11 += 50;
            if (this.a != null) {
               bc.a.drawImage(this.a, 42, 115, 33);
            }

            if (var8 != null) {
               for(var5 = 2; var5 < var8.length; ++var5) {
                  var11 += gj.a.b + 4;
                  gj.a.a(bc.a, var8[var5], 20, var11, 0);
               }

               return;
            }

            var11 = 118 + gj.a.b + 4;
            gj.a.a(bc.a, "(str) Chưa vào bang hội.", 20, var11, 0);
         }

      }
   }

   public final void a(Object var1) {
      gq var6;
      switch((var6 = (gq)((Object[])var1)[0]).a) {
      case 1:
         Vector var2;
         (var2 = new Vector()).addElement(new gq(3, "Thông tin chung", this));
         var2.addElement(new gq(4, "Thông tin bang chúng", this));
         var2.addElement(new gq(5, "Top nộp quỹ", this));
         var2.addElement(new gq(6, "Top điểm phát triển", this));
         this.a(var2, 0);
         return;
      case 2:
      default:
         ez var7;
         int var9;
         gq var15;
         if ((this.b & 1) != 0) {
            switch(var6.a) {
            case 2:
               if (this.a && !((af)var6.a).a.trim().toUpperCase().equals(eg.a.b)) {
                  h var14;
                  if ((var14 = this.a()) != null) {
                     var15 = new gq(9, "Đuổi", this);
                     Vector var18 = new Vector();
                     var15.a = var14.a;
                     var18.addElement(var15);
                     this.a(var18, 2);
                  }

                  return;
               }
               break;
            case 9:
               if (var6.a != null) {
                  fh.i();
                  var9 = ((af)var6.a).a;
                  (var7 = new ez(81)).a(91);
                  var7.a(6);
                  var7.b(var9);
                  eu.a.a(var7);
                  var7.a();
                  return;
               }
               break;
            case 13:
               if (this.b > 1) {
                  fh.i();
                  bf.a(this.b - 1, false);
                  return;
               }
               break;
            case 14:
               if (this.b < this.c) {
                  fh.i();
                  bf.a(this.b + 1, false);
               }
            }

            return;
         } else {
            gq var3;
            int var5;
            af var8;
            h var10;
            ez var12;
            if ((this.b & 4) != 0) {
               switch(var6.a) {
               case 2:
                  if (this.b == null) {
                     if ((var10 = this.a()) != null && var10.a != null) {
                        (var3 = new gq(7, "Đồng ý", this)).a = var10.a;
                        fh.a("Bạn muốn gia nhập: " + ((af)var10.a).a, var3, j.b);
                     }

                     return;
                  }
               case 3:
               case 4:
               case 5:
               case 6:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               default:
                  break;
               case 7:
                  if (var6.a == null) {
                     fh.a("Không tìm thấy bang hội", true);
                  } else {
                     var8 = (af)var6.a;
                     fh.i();
                     var5 = var8.a;
                     (var12 = new ez(81)).a(91);
                     var12.a(2);
                     var12.b(var5);
                     eu.a.a(var12);
                     var12.a();
                  }

                  return;
               case 13:
                  if (this.b > 1) {
                     fh.i();
                     bf.f(this.b - 1);
                     return;
                  }
                  break;
               case 14:
                  if (this.b < this.c) {
                     fh.i();
                     bf.f(this.b + 1);
                     return;
                  }
                  break;
               case 15:
                  fh.a("Tìm bang", new gq(16, "Ok", this), j.b, 0);
                  return;
               case 16:
                  String var16;
                  if (fs.a != null && fs.a instanceof fm && (var16 = ((fm)fs.a).a(0)).length() != 0) {
                     (var12 = new ez(81)).a(91);
                     var12.a(13);
                     var12.a(var16);
                     eu.a.a(var12);
                     var12.a();
                  }
               }

               return;
            } else if ((this.b & 8) != 0) {
               switch(var6.a) {
               case 2:
                  if ((var10 = this.a()) == null) {
                     return;
                  }

                  Vector var13 = new Vector();
                  var15 = new gq(7, "Đồng ý", this);
                  gq var17 = new gq(8, "Từ chối", this);
                  var15.a = var10.a;
                  var17.a = var10.a;
                  var13.addElement(var15);
                  var13.addElement(var17);
                  this.a(var13, 2);
                  break;
               case 7:
                  if (var6.a == null) {
                     return;
                  }

                  fh.i();
                  var9 = ((af)var6.a).a;
                  (var7 = new ez(81)).a(91);
                  var7.a(5);
                  var7.b(var9);
                  var7.a(true);
                  eu.a.a(var7);
                  var7.a();
                  break;
               case 8:
                  if (var6.a != null) {
                     fh.i();
                     var9 = ((af)var6.a).a;
                     (var7 = new ez(81)).a(91);
                     var7.a(5);
                     var7.b(var9);
                     var7.a(false);
                     eu.a.a(var7);
                     var7.a();
                  }

                  return;
               default:
                  return;
               }
            } else if ((this.b & 16) != 0) {
               switch(var6.a) {
               case 2:
                  if ((var10 = this.a()) != null) {
                     af var11 = (af)var10.a;
                     (var15 = new gq(8, "Ok", this)).a = var11;
                     fh.a("Bạn muốn đóng góp " + var11.a, (gq)null, var15, j.b, true);
                     return;
                  }
                  break;
               case 7:
                  this.a((fs)null);
                  return;
               case 8:
                  if (var6.a != null) {
                     var5 = ((af)var6.a).a;
                     (var12 = new ez(81)).a(91);
                     var12.a(10);
                     var12.b(var5);
                     eu.a.a(var12);
                     var12.a();
                     this.a((fs)null);
                  }
               }

               return;
            } else if ((this.b & 64) != 0) {
               switch(var6.a) {
               case 13:
                  if (this.b <= 1) {
                     return;
                  }

                  fh.i();
                  bf.c(this.c, this.b - 1);
                  break;
               case 14:
                  if (this.b < this.c) {
                     fh.i();
                     bf.c(this.c, this.b + 1);
                  }

                  return;
               default:
                  return;
               }
            } else if ((this.b & 128) != 0) {
               switch(var6.a) {
               case 13:
                  if (this.b > 1) {
                     fh.i();
                     bf.d(this.c, this.b - 1);
                     return;
                  }
                  break;
               case 14:
                  if (this.b < this.c) {
                     fh.i();
                     bf.d(this.c, this.b + 1);
                  }
               }

               return;
            } else if ((this.b & 256) != 0) {
               switch(var6.a) {
               case 2:
                  if (this.a) {
                     var10 = this.a();
                     var3 = new gq(7, "Ok", this);
                     af var4 = (af)var10.a;
                     var3.a = var4;
                     fh.a("Bạn chắc chắn muốn nhường quyền bang chủ cho " + var4.a, var3, j.b);
                     return;
                  }
                  break;
               case 7:
                  if (var6.a != null) {
                     var8 = (af)var6.a;
                     var9 = var8.a;
                     var5 = this.c;
                     (var7 = new ez(81)).a(91);
                     var7.a(12);
                     var7.b(var5);
                     var7.b(var9);
                     eu.a.a(var7);
                     var7.a();
                     return;
                  }
                  break;
               case 13:
                  if (this.b > 1) {
                     fh.i();
                     bf.a(this.b - 1, true);
                     return;
                  }
                  break;
               case 14:
                  if (this.b < this.c) {
                     fh.i();
                     bf.a(this.b + 1, true);
                  }
               }
            }
         }

         return;
      case 3:
         fh.i();
         bf.a();
         return;
      case 4:
         fh.i();
         bf.a(1, false);
         return;
      case 5:
         fh.i();
         bf.d(this.c, 1);
         return;
      case 6:
         fh.i();
         bf.c(this.c, 1);
      }
   }

   public final void a(byte var1, byte var2, int var3, boolean var4, int var5, String var6, int var7, int var8, Vector var9, boolean var10) {
      if (var10) {
         this.b = 256;
      } else {
         this.b = 1;
      }

      this.c(this.a);
      this.c = var3;
      this.a = var4;
      this.b = this.a = var6;
      this.b = var1;
      this.c = var2;
      this.a(var9);
      this.h();
      this.l = new gq(1, "menu", this);
      this.d = this.a;
      if (this.a.b() > 0) {
         this.a.a(0).l();
      }

   }

   public final void a(int var1, String[] var2) {
      this.b = 2;
      this.c = var1;
      this.c(this.a);
      this.a = var2;
      this.d = null;
      this.l = new gq(1, "menu", this);
      this.m = null;
      this.n = j.e;
   }

   public final void b(Vector var1) {
      this.b = 8;
      this.c(this.a);
      this.a(var1);
      if (this.a.b() > 0) {
         this.a.a(0).l();
      }

      this.n = j.e;
      this.l = null;
   }

   public final void a(String var1, Vector var2, byte var3, byte var4) {
      this.b = 4;
      this.c(this.a);
      this.b = var1;
      this.a = false;
      this.a = null;
      this.l = null;
      this.b = var3;
      this.c = var4;
      this.a(var2);
      this.h();
      if (this.a.b() > 0) {
         this.a.a(0).l();
      }

      this.l = new gq(15, "Tìm", this);
   }

   public final void a(byte var1, byte var2, Vector var3) {
      this.b = 64;
      this.c(this.a);
      this.d = "Top điểm phát triển";
      this.b = var1;
      this.c = var2;
      this.a(var3);
      this.h();
      this.l = new gq(1, "menu", this);
      this.m = null;
      this.n = j.e;
      if (this.a.b() > 0) {
         this.a.a(0).l();
      }

   }

   public final void b(byte var1, byte var2, Vector var3) {
      this.b = 128;
      this.c(this.a);
      this.d = "Top nộp quỹ";
      this.b = var1;
      this.c = var2;
      this.a(var3);
      this.h();
      this.l = new gq(1, "menu", this);
      this.m = null;
      this.n = j.e;
      if (this.a.b() > 0) {
         this.a.a(0).l();
      }

   }

   public final void c(Vector var1) {
      this.b = 16;
      this.c(this.a);
      this.a(var1);
      this.n = new gq(7, "Thôi", this);
      this.l = null;
      this.m = null;
      if (this.a.b() > 0) {
         this.a.a(0).l();
      }

   }

   public final void a(boolean var1, int var2, String var3, String var4, Object var5) {
      this.b = 32;
      this.c(this.a);
      this.d = null;
      this.e = var4;
      this.a = new Object[]{var3, var5};
      if (var1) {
         this.l = new gq("Mời gia nhập", new ct(this));
         this.l.a = new Integer(var2);
      } else {
         this.l = null;
      }

      this.n = j.e;
   }

   private void h() {
      fz var1 = new fz(0, 0, bc.b, gg.m);
      ff var2;
      if (this.b > 1) {
         (var2 = new ff("<<<")).q = 17;
         var2.a(gg.p, gg.p, 30, gg.m);
         var2.d = new gq(13, "Quay lui", this);
         var1.a(var2);
      }

      if (this.b < this.c) {
         (var2 = new ff(">>>")).q = 17;
         var2.a(bc.b - 30 - gg.p, gg.p, 30, gg.m);
         var2.d = new gq(14, "Tới", this);
         var1.a(var2);
      }

      this.a.a(var1);
      this.a.c(1);
   }

   public final void b(int var1) {
      int var2 = this.a.b();

      fy var3;
      h var4;
      do {
         --var2;
         if (var2 < 0) {
            return;
         }
      } while((var3 = this.a.a(var2)) == null || !(var3 instanceof h) || ((af)(var4 = (h)var3).a).a != var1);

      this.a.b(var3);
      this.a.c(1);
      if (this.a.b() > 0) {
         this.a.a(0).l();
      }

   }
}
