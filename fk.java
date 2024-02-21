import javax.microedition.lcdui.Image;

public final class fk extends fh implements go {
   private fi a;

   public fk(fi var1) {
      this.a = var1;
      this.e = new gq(-1, gk.a(0), this);
      this.d = new gq(-2, gk.a(7), this);

      for(int var4 = 0; var4 < fl.a.length; ++var4) {
         ff var2;
         (var2 = new ff(0)).y = 1;
         this.x = 1;
         var2.a(0, 0, fl.a + 4, fl.a + 4);
         Image var3 = Image.createImage(fl.b, var4 * fl.a, 0, fl.a, fl.a, 0);
         var2.a((Image)var3);
         var2.e = fl.a[var4];
         var2.d = this.d;
         this.a(var2, false);
      }

      this.m = true;
      this.b = 5;
      this.c(2);
      this.v = this.r = 1;
      this.w = bc.a().b.u - this.u - gg.m;
      this.s = bc.a().b.u - gg.m;
      this.j = true;
      this.l = true;
      fy var5 = this.a(0);
      bc.a().a(var5);
   }

   public final void c() {
      bc.a.setColor(gg.a);
      bc.a.fillRect(2, 2, this.t - 4, this.u - 4);
   }

   public final void a(Object var1) {
      switch(((gq)((Object[])var1)[0]).a) {
      case -2:
         this.b_();
         if (this.c == null) {
            return;
         } else {
            if (this.a == null) {
               if (bc.a().a != null) {
                  bc.a().a.g = true;
               }

               this.a = bc.a().a;
            }

            this.a.b(this.a.a() + ((ff)this.c).e);
            fi var2 = this.a;
            bc.a().a((fy)var2);
            if (!this.a.g) {
               this.a.g = true;
               bc.a().b((fy)this.a);
            }
         }
      default:
         return;
      case -1:
         this.b_();
      }
   }
}
