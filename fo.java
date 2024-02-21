import javax.microedition.lcdui.Image;

public class fo extends fz implements go {
   protected int a = 43;
   public gp a;
   public fl a;
   public fl b;
   public fl c;
   public fl d;
   public fl e;
   protected String[] a;
   private byte a;
   private boolean a;

   public fo(gp var1, int var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.a = gj.a;
      this.b = gj.a;
      this.c = gj.b;
      this.d = gj.b;
      this.e = gj.a;
      this.a = 0;
      this.a = false;
      this.a = var1;
      this.x = 1;
      gp var10000 = this.a;
      this.a(var2, var3, var4, var5);
   }

   public final void c() {
      gg.a(this);
   }

   public void a() {
      gp var1;
      Image var2 = (var1 = this.a).a();
      int var3 = this.y;
      if (var2 != null) {
         bc.a.drawImage(var2, gg.p + (this.a >> 1), this.u >> 1, 3);
      }

      int var4;
      int var5;
      int var6;
      int var7;
      if (this.e) {
         var4 = bc.a.getClipX();
         var5 = bc.a.getClipY();
         var6 = bc.a.getClipWidth();
         var7 = bc.a.getClipHeight();
         bc.a.clipRect(gg.p + (var2 != null ? this.a : 0), 0, this.t - this.a, this.u);
         this.b.a(bc.a, var1.a(), gg.p + (var2 != null ? this.a : 0), var3, 20);
         bc.a.setClip(var4, var5, var6, var7);
         var3 += this.b.a();
      } else {
         this.a.a(bc.a, var1.a(), gg.p + (var2 != null ? this.a : 0), var3, 20);
         var3 += this.a.a();
      }

      if (this.a != null) {
         if (this.e) {
            for(var4 = 0; var4 < this.a.length; ++var4) {
               this.d.a(bc.a, this.a[var4], gg.p + (var2 != null ? this.a : 0), var3, 20);
               var3 += this.d.a() + 2;
            }
         } else {
            for(var4 = 0; var4 < this.a.length; ++var4) {
               this.c.a(bc.a, this.a[var4], gg.p + (var2 != null ? this.a : 0), var3, 20);
               var3 += this.c.a() + 2;
            }
         }
      }

      String var9;
      if ((var9 = var1.b()) != null) {
         var5 = bc.a.getClipX();
         var6 = bc.a.getClipY();
         var7 = bc.a.getClipWidth();
         int var8 = bc.a.getClipHeight();
         bc.a.clipRect(gg.p + (var2 != null ? this.a : 0), this.u - this.d.a() - this.y - 10, this.t - 20 - gg.p - this.a, this.u);
         boolean var10000 = this.e;
         if (!this.e) {
            this.c.a(bc.a, var9, gg.p + (var2 != null ? this.a : 0), this.u - this.d.a() - this.y - 10, 20);
         }

         bc.a.setClip(var5, var6, var7, var8);
      }

      if (this.e || this.k) {
         super.a();
      }

   }

   protected final void b() {
      if (this.x > 0) {
         gg.b(this);
      }

   }

   public final void a_() {
      super.a_();
      if (this.a.b() != null) {
         fn var1;
         (var1 = new fn(this.a.b(), this.d)).y = 0;
         gp var10000 = this.a;
         int var2 = 0;
         if (gg.a == 1) {
            var2 = gg.p << 1;
         }

         if (this.a == null) {
            var1.a(gg.p + (this.a.a() != null ? 40 : 0), this.u - this.d.a() - this.y - 10, this.t - (gg.p << 1) - 40, this.d.a() + var2);
         } else {
            var1.a(gg.p + (this.a.a() != null ? 40 : 0), this.u - this.d.a() - this.y - 10, this.t - (gg.p << 1) - 40, this.d.a() + var2);
         }

         var1.h = false;
         this.m();
         this.a(var1, false);
         var1.a(1000L);
      }
   }

   public final void g() {
      super.g();
      this.m();
   }

   public final void a(Object var1) {
   }
}
