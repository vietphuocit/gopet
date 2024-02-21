import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.TextBox;

public final class fi extends fy implements go {
   private static int d = 0;
   private static final int[] a = new int[]{18, 14, 11, 9, 6, 4, 2};
   private static int e = 0;
   private static String[] a = new String[]{" 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2áàảãạâấầẩẫậăắằẳẵặ2", "def3đéèẻẽẹêếềểễệ3", "ghi4íìỉĩị4", "jkl5", "mno6óòỏõọôốồổỗộơớờởỡợ6", "pqrs7", "tuv8úùủũụưứừửữự8", "wxyz9ýỳỷỹỵ9", "*", "#"};
   private static String[] b = new String[]{"0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0"};
   protected String a;
   private String b;
   private String c;
   private int f;
   private int g;
   public int a;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   public int b;
   private static boolean a;
   private boolean b;
   private int m;
   private boolean c;
   private String d;
   public int c;
   private int n;
   private static String[] c = new String[]{"abc", "Abc", "ABC", "123"};
   private static int o = 35;
   private static int p = 42;
   private fl a;
   private fl b;
   private int q;
   private gq f;
   public static gq a;
   private int F;
   private int G;
   private int H;
   private int I;
   private String e;
   public go a;
   private int J;
   private long a;

   public fi() {
      this(0, 0, 0, 0, "");
   }

   public fi(int var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, (String)null);
   }

   private fi(int var1, int var2, int var3, int var4, String var5) {
      this(var1, var2, var3, var4, var5, gj.b, gj.b, gj.a);
   }

   private fi(int var1, int var2, int var3, int var4, String var5, fl var6, fl var7, fl var8) {
      super(var1, var2, var3, var4);
      this.a = "";
      this.b = "";
      this.c = "";
      this.f = 0;
      this.g = 0;
      this.a = 500;
      this.h = 0;
      this.i = -1982;
      this.j = 0;
      this.k = 0;
      this.l = 10;
      this.b = 0;
      this.b = true;
      this.c = false;
      this.c = 0;
      this.n = 0;
      this.a = gj.b;
      this.b = gj.b;
      int var10000 = gg.d;
      this.q = 0;
      this.e = "";
      this.J = 0;
      this.a = 0L;
      this.a = var6;
      this.b = var8;
      this.c = var5 == null ? 0 : var6.a(var5) + 2 * gg.p;
      this.d = var5;
      this.c = false;
      this.a = "";
      e = this.a.a() - 1;
      this.e = this.f = new gq(0, gk.a(3), this);
      this.m = this.b.a("ABC") + 5;
      this.x = 1;
      this.i();
   }

   public final void a(int var1, int var2, int var3, int var4) {
      super.a(var1, var2, var3, var4);
      if (this.c != 0) {
         String var5 = this.d;

         for(this.c = this.a.a(var5) + this.y; this.c > (this.t << 1) / 3; this.c = this.a.a(var5) + this.y) {
            var5 = var5.substring(0, var5.length() - 1);
         }

         this.d = var5;
         this.i();
      }
   }

   public final void a(int var1) {
      this.b = var1;
      switch(var1) {
      case 0:
      case 2:
      case 3:
         this.n = 0;
         break;
      case 1:
         this.n = 3;
      }

      this.m = 0;
      if (this.b) {
         this.m = this.b.a("ABC") + 5;
      }

   }

   public final void a(String var1) {
      this.b(gj.a.a(var1) + (this.y << 1));
      this.d = var1;
   }

   public final void h() {
      if (this.f > 0 && this.a.length() > 0) {
         this.a = this.a.substring(0, this.f - 1) + this.a.substring(this.f, this.a.length());
         --this.f;
         this.i();
         this.j();
      }

   }

   private void i() {
      if (this.a.length() == 0) {
         this.c = this.e;
         this.c = this.b;
      } else {
         this.c = this.a;
      }

      this.F = this.c;
      this.G = 0;
      this.H = this.t - 1 - this.c;
      this.I = this.u - 1;
      if (this.h < 0 && this.a.a(this.c) + this.h < this.H - this.y - 13 - this.m) {
         this.h = this.H - 10 - this.m - this.a.a(this.c);
      }

      if (this.h + this.a.a(this.c.substring(0, this.f)) <= 0) {
         this.h = -this.a.a(this.c.substring(0, this.f));
         this.h += 40;
      } else if (this.h + this.a.a(this.c.substring(0, this.f)) >= this.H - 12 - this.m) {
         this.h = this.H - 10 - this.m - this.a.a(this.c.substring(0, this.f)) - (this.y << 1);
      }

      if (this.h > 0) {
         this.h = 0;
      }

      if (this.a != null) {
         this.a.a(new Object[]{new gq(-6, (String)null, (go)null), this});
      }

   }

   private boolean a(int var1) {
      if (this.b == 3) {
         if ((var1 < 48 || var1 > 57) && (var1 < 65 || var1 > 90) && (var1 < 97 || var1 > 122)) {
            return false;
         }
      } else if (this.b == 1 && (var1 < 48 || var1 > 57)) {
         return false;
      }

      if (this.a.length() < this.a) {
         String var2 = this.a.substring(0, this.f) + (char)var1;
         if (this.f < this.a.length()) {
            var2 = var2 + this.a.substring(this.f, this.a.length());
         }

         this.a = var2;
         ++this.f;
         this.j();
         this.i();
      }

      return true;
   }

   protected final void b() {
      if (gg.a == 0) {
         gg.a(this);
      } else {
         if (this.e) {
            bc.a.setColor(1655180);
         } else {
            bc.a.setColor(3033945);
         }

         bc.a.drawRect(this.F, 0, this.H, this.I);
         if (this.e) {
            bc.a.setColor(gg.d);
            bc.a.drawRect(this.F + 1, 1, this.H - 2, this.I - 2);
         }

      }
   }

   public final void c() {
      if (gg.a != 1) {
         if (this.e) {
            bc.a.setColor(gg.f);
            if (this.c == 0) {
               bc.a.fillRoundRect(0, 0, this.t - 1, this.u - 1, gg.q, gg.q);
            } else {
               bc.a.fillRoundRect(0 + this.c, 0, this.t - 1 - this.c, this.u - 1, gg.q, gg.q);
            }
         }

         if (!a && this.b) {
            bc.a.setColor(gg.g);
            bc.a.fillRect(this.t - this.m - 3, 3, this.m, this.I - 4);
            bc.a.fillRect(this.t - 3, 4, 1, this.I - 6);
            this.b.a(bc.a, c[this.n], this.t - 4, this.I - this.b.a() >> 1, 24);
         }

      } else {
         if (this.e || this.x > 0) {
            bc.a.setColor(16777215);
            bc.a.fillRect(this.F + 1, 1, this.H - 1, this.u - 2);
         }

         if (!a && this.b != 1) {
            bc.a.setColor(8955067);
            bc.a.fillRect(this.t - this.m - 3, 3, this.m, this.I - 5);
            this.b.a(bc.a, c[this.n], this.t - 3, this.I - this.b.a() >> 1, 24);
         }

      }
   }

   public final void a() {
      if (this.a.length() == 0) {
         this.c = this.e;
      } else if (this.b == 2) {
         this.c = this.b;
      } else {
         this.c = this.a;
      }

      if (this.c == 0) {
         this.a.a(bc.a, this.c, gg.p + this.h, this.u - this.a.a() - this.y - this.x >> 1, 20);
      } else {
         bc.a.clipRect(0, 0, this.F + this.H - this.m - 6, this.I);
         if (this.e) {
            gj.a.a(bc.a, this.d, -this.J, this.u - this.a.a() >> 1, 20);
         } else {
            gj.a.a(bc.a, this.d, 0, this.u - this.a.a() >> 1, 20);
         }

         bc.a.setClip(this.F + 3, 0, this.H - this.m - 6, this.I);
         this.a.a(bc.a, this.c, gg.p + this.h + this.c, this.I - this.a.a() >> 1, 20);
      }

      if (this.e && this.j == 0 && (this.l > 0 || this.g / 5 % 2 == 0)) {
         bc.a.setColor(gg.h);
         if (this.c == 0) {
            bc.a.fillRect(gg.p + this.h + this.a.a(this.c.substring(0, this.f)) + 1, (this.u - e >> 1) + 1, 1, e);
            return;
         }

         bc.a.fillRect(gg.p + this.h + this.c + this.a.a(this.c.substring(0, this.f)) + 1, (this.u - e >> 1) + 1, 1, e);
      }

   }

   private void j() {
      if (this.b == 2) {
         this.b = "";

         for(int var1 = 0; var1 < this.a.length(); ++var1) {
            this.b = this.b + "*";
         }

         if (this.j > 0 && this.f > 0) {
            this.b = this.b.substring(0, this.f - 1) + this.a.charAt(this.f - 1) + this.b.substring(this.f, this.b.length());
         }
      }

   }

   public final void e() {
      super.e();
      ++this.g;
      if (this.j > 0) {
         --this.j;
         if (this.j == 0) {
            this.k = 0;
            if (this.n == 1 && this.i != o) {
               this.n = 0;
            }

            this.i = -1982;
            this.j();
         }
      }

      if (this.l > 0) {
         --this.l;
      }

      if (System.currentTimeMillis() > 100L && this.d != null && this.c < this.a.a(this.d)) {
         this.J = ++this.J >= this.a.a(this.d) ? -this.c : this.J;
      }

   }

   public final String a() {
      return this.a;
   }

   public final void b(String var1) {
      if (var1 != null) {
         this.i = -1982;
         this.j = 0;
         this.k = 0;
         this.a = var1;
         this.c = var1;
         this.j();
         this.f = var1.length();
         this.i();
      }
   }

   public final boolean c(int var1, int var2) {
      if (this.k) {
         this.k = false;
         TextBox var4;
         (var4 = new TextBox("", "", 500, 0)).addCommand(new Command(gk.a(6), 4, 0));
         var4.addCommand(new Command(gk.a(0), 2, 0));
         var4.setCommandListener(new fj(this, var4));
         if (this.b == 2) {
            var4.setConstraints(65536);
         } else if (this.b == 1) {
            var4.setConstraints(2);
         } else {
            var4.setConstraints(0);
         }

         var4.setString(this.a);
         var4.setMaxSize(this.a);
         Display.getDisplay(bc.a.a).setCurrent(var4);
         return true;
      } else {
         return false;
      }
   }

   public final boolean a(int var1, int var2) {
      if (var1 == 1) {
         return false;
      } else if (var2 == -8) {
         this.h();
         return true;
      } else {
         if (var2 >= 65 && var2 <= 122) {
            a = true;
            this.m = 0;
         }

         if (a) {
            if (var2 == 45) {
               if (var2 == this.i && this.j < a[0] && this.b != 1) {
                  this.a = this.a.substring(0, this.f == 0 ? 0 : this.f - 1) + '_';
                  this.c = this.a;
                  this.j();
                  this.i();
                  this.i = -1982;
                  return true;
               }

               this.i = 45;
            }

            if (this.g && fl.a && var2 == p && this.b == 0 && a != null) {
               a.a(new Object[]{a, this});
               return true;
            }

            if (this.b == 1) {
               if (var2 >= 48 && var2 <= 57) {
                  return this.a(var2);
               }

               return false;
            }

            if (var2 >= 32) {
               return this.a(var2);
            }
         }

         if (var2 == o) {
            if (this.b != 1) {
               this.n = ++this.n % 4;
            }

            this.j = 1;
            this.i = var2;
            return true;
         } else if (this.g && fl.a && var2 == p && this.b == 0 && a != null) {
            a.a(new Object[]{a, this});
            return true;
         } else {
            if (var2 == 42) {
               var2 = 58;
            }

            if (var2 == 35) {
               var2 = 59;
            }

            if (var2 >= 48 && var2 <= 59) {
               if (this.b != 0 && this.b != 2 && this.b != 3) {
                  if (this.b == 1) {
                     this.a(var2);
                     this.j = 1;
                  }
               } else {
                  String[] var3;
                  if (this.b == 3) {
                     var3 = b;
                  } else {
                     var3 = a;
                  }

                  char var4;
                  String var5;
                  if (var2 == this.i) {
                     this.k = (this.k + 1) % var3[var2 - 48].length();
                     var4 = var3[var2 - 48].charAt(this.k);
                     if (this.n == 0) {
                        var4 = Character.toLowerCase(var4);
                     } else if (this.n == 1) {
                        var4 = Character.toUpperCase(var4);
                     } else if (this.n == 2) {
                        var4 = Character.toUpperCase(var4);
                     } else {
                        var4 = var3[var2 - 48].charAt(var3[var2 - 48].length() - 1);
                     }

                     var5 = this.a.substring(0, this.f > 0 ? this.f - 1 : 0) + var4;
                     if (this.f < this.a.length()) {
                        var5 = var5 + this.a.substring(this.f, this.a.length());
                     }

                     this.a = var5;
                     this.j = a[0];
                     this.j();
                  } else if (this.a.length() < this.a) {
                     if (this.n == 1 && this.i != -1982) {
                        this.n = 0;
                     }

                     this.k = 0;
                     var4 = var3[var2 - 48].charAt(this.k);
                     if (this.n == 0) {
                        var4 = Character.toLowerCase(var4);
                     } else if (this.n == 1) {
                        var4 = Character.toUpperCase(var4);
                     } else if (this.n == 2) {
                        var4 = Character.toUpperCase(var4);
                     } else {
                        var4 = var3[var2 - 48].charAt(var3[var2 - 48].length() - 1);
                     }

                     var5 = this.a.substring(0, this.f) + var4;
                     if (this.f < this.a.length()) {
                        var5 = var5 + this.a.substring(this.f, this.a.length());
                     }

                     this.a = var5;
                     this.j = a[0];
                     ++this.f;
                     this.j();
                     this.i();
                  }

                  this.i = var2;
                  boolean var10000 = true;
               }

               return true;
            } else {
               this.k = 0;
               this.i = -1982;
               if (var2 == -3) {
                  if (this.f > 0) {
                     --this.f;
                     this.i();
                     this.l = 10;
                     return true;
                  }
               } else if (var2 == -4) {
                  if (this.f < this.a.length()) {
                     ++this.f;
                     this.i();
                     this.l = 10;
                     return true;
                  }
               } else {
                  this.i = var2;
               }

               return false;
            }
         }
      }
   }

   public final void a(Object var1) {
      if ((gq)((Object[])var1)[0] == this.f) {
         this.h();
      }

   }

   public final void b(int var1) {
      if (var1 > this.t - 60) {
         var1 = this.t - 60;
      }

      this.c = var1;
      this.i();
   }
}
