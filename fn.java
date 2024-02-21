import javax.microedition.lcdui.Image;

public class fn extends fy {
   public String e;
   public gs a;
   public int p;
   public byte d;
   public boolean b;
   public int q;
   private int a;
   private int b;
   private int c;
   private int d;
   private boolean a;
   private boolean d;
   public fl a;
   public fl b;
   public boolean c;
   public byte e;
   private long a;
   private long b;
   private long c;
   private long d;

   public fn() {
      this.p = 0;
      this.d = 0;
      this.b = false;
      this.q = 20;
      this.a = 8;
      this.b = 2;
      this.c = 0;
      this.d = 0;
      this.a = false;
      this.d = true;
      this.a = gj.a;
      this.b = gj.a;
      this.c = false;
      this.e = 0;
      this.b = -1L;
      this.d = -1L;
   }

   public fn(String var1) {
      this(var1, gg.a == 0 ? gj.b : gj.a);
   }

   public fn(String var1, fl var2) {
      this(var1, var2, var2);
   }

   private fn(String var1, fl var2, fl var3) {
      this.p = 0;
      this.d = 0;
      this.b = false;
      this.q = 20;
      this.a = 8;
      this.b = 2;
      this.c = 0;
      this.d = 0;
      this.a = false;
      this.d = true;
      this.a = gj.a;
      this.b = gj.a;
      this.c = false;
      this.e = 0;
      this.b = -1L;
      this.d = -1L;
      this.a = var2;
      this.b = var3 == null ? var2 : var3;
      this.y = gg.p;
      this.a(var1);
      this.h = false;
   }

   private void h() {
      this.a.b = Math.max(this.a.a(), this.b.a());
      if (this.e != null) {
         this.a.a = Math.max(this.a.a(this.e), this.b.a(this.e));
      }

      if (this.a != null) {
         gl var10000 = this.a;
         var10000.a += this.a.a + this.b;
         this.a.b = Math.max(this.a.b, this.a.b);
      }

      this.u = this.a.b + 2 * (this.y + this.x);
      this.t = this.a.a + 2 * (this.y + this.x);
   }

   public final void a(String var1) {
      this.e = var1;
      this.h();
   }

   public final void a(fl var1, fl var2) {
      this.a = var1;
      this.b = var2 == null ? var1 : var2;
      this.h();
   }

   public void a(Image var1) {
      if (var1 != null) {
         this.a(var1, new gl(var1.getWidth(), var1.getHeight()), false);
      }
   }

   public final void a(Image var1, gl var2) {
      if (var1 != null) {
         this.a(var1, var2, false);
      }
   }

   private void a(Image var1, gl var2, boolean var3) {
      if (var1 != null) {
         this.a = new gs(var1, var2.a, var2.b, false);
         this.p = 0;
         this.a = new gl(var2.a, var2.b);
      }
   }

   public void a() {
      if (this.a == null && (this.e == null || this.e.length() == 0)) {
         (this.e ? this.b : this.a).a(bc.a, "", this.q == 17 ? (this.t >> 1) - this.y : this.c, 0, this.q);
      } else {
         int var1 = bc.a.getClipX();
         int var2 = bc.a.getClipY();
         int var3 = bc.a.getClipWidth();
         int var4 = bc.a.getClipHeight();
         int var5;
         int var6;
         if (this.a != null) {
            int var10000;
            boolean var10001;
            if (this.e == null || "".equals(this.e)) {
               var10000 = (this.u >> 1) - this.y - this.x;
               var10001 = this.b;
               var5 = var10000;
               this.a.a(bc.a, this.p, (this.t >> 1) - this.y - this.x, var5, 0, 3);
               return;
            }

            if (this.a == 32) {
               var5 = Math.max(this.a.a(), this.b.a());
               var10000 = this.u - (this.y + this.x << 1) - var5 >> 1;
               var10001 = this.b;
               var6 = var10000;
               this.a.a(bc.a, this.p, (this.t >> 1) - this.y - this.x, var6, 0, 3);
            } else {
               var5 = this.a == 4 ? this.t - (this.y + this.x << 1) : 1;
               boolean var7 = this.b;
               this.a.a(bc.a, this.p, var5, 0, 0, this.a == 8 ? 20 : 24);
               if (this.a == 8) {
                  bc.a.clipRect(this.a.a, 0, this.t - this.a.a - (this.y << 1) - this.b, this.u);
               } else if (this.a == 4) {
                  bc.a.clipRect(0, 0, this.t - this.a.a - (this.y << 1) - this.b, this.u);
               }
            }
         }

         if (this.q == 24) {
            if (this.a == null) {
               (this.e ? this.b : this.a).a(bc.a, this.e, this.t - (this.y << 1), (this.u >> 1) - (this.h ? this.b.a() >> 1 : this.a.a() >> 1) - gg.p, this.q);
            } else {
               (this.e ? this.b : this.a).a(bc.a, this.e, this.a == 8 ? this.t - (this.y << 1) : this.t - (this.y << 1) - this.a.a + this.b, (this.u >> 1) - (this.h ? this.b.a() >> 1 : this.a.a() >> 1) - gg.p, this.q);
            }
         } else {
            var5 = this.q == 17 ? (this.t >> 1) - this.y - this.x : (this.a == 8 ? this.c + (this.a == null ? 0 : this.a.a + this.b) : (this.t >> 1) - (this.e ? this.b : this.a).a(this.e) - gg.p);
            var6 = Math.max(this.a.a(), this.b.a());
            var6 = this.a == 32 ? this.u - (this.x + this.y << 1) - var6 : (this.u >> 1) - ((this.e ? this.b : this.a).a() >> 1) - gg.p;
            (this.e ? this.b : this.a).a(bc.a, this.e, var5, var6, this.q);
         }

         bc.a.setClip(var1, var2, var3, var4);
      }
   }

   public void c() {
      if (this.c && bc.a % 10 > 3) {
         bc.a.setColor(15597568);
      } else {
         if (this.e != 1) {
            return;
         }

         if (gg.a == 0) {
            bc.a.setColor(gg.e);
         } else {
            bc.a.setColor(802440);
         }
      }

      bc.a.fillRect(0, 0, this.t, this.u);
   }

   public final void a(long var1) {
      int var2 = 0;
      if (this.e != null) {
         var2 = this.b.a(this.e);
      }

      if (this.e == 0) {
         this.d = var2 - (this.t - (this.y << 1) - (this.a != null && this.q != 1 ? this.b + this.a.a : 0));
      } else {
         this.d = var2;
      }

      if (this.d > 0 && this.t > 0) {
         this.a = System.currentTimeMillis();
         this.b = 1000L;
      }

   }

   private void a(int var1) {
      this.a = false;
      this.c = System.currentTimeMillis();
      this.d = (long)var1;
   }

   public void e() {
      super.e();
      long var1 = System.currentTimeMillis();
      if (this.b != -1L && var1 - this.a >= this.b) {
         this.b = -1L;
         this.a = true;
      }

      if (this.d != -1L && var1 - this.c >= this.d) {
         this.d = -1L;
         if (this.e == 1) {
            this.w = -this.u;
         } else {
            this.c = 0;
         }
      }

      if (this.a && this.s == this.w && this.r == this.v) {
         this.c -= 2;
         if (this.c < -this.d) {
            this.a(1000);
         }
      }

      if (this.s <= -this.u) {
         fs.a = null;
      }

      if (bc.a % 3 == 0 && this.a != null && this.b) {
         ++this.p;
         if (this.p >= this.a.c) {
            this.p = 0;
         }
      }

   }

   public void a_() {
      super.a_();
      if (this.d) {
         this.a(1000L);
      }

   }

   public void g() {
      super.g();
      if (this.d && this.a) {
         this.a(0);
      }

   }
}
