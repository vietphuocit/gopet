import javax.microedition.lcdui.Image;

public final class h extends fo {
   private static final Image[] a;

   public h(gp var1, int var2, int var3, int var4, int var5) {
      super(var1, 0, 0, var4, var5);
   }

   public final void a() {
      af var1;
      Image var2 = (var1 = (af)this.a).a();
      int var3 = this.y;
      if (var2 != null) {
         switch(var1.a) {
         case 1:
            bc.a.drawImage(a[0], gg.p + this.a, 0, 24);
            break;
         case 2:
            bc.a.drawImage(a[1], gg.p + this.a, 0, 24);
            break;
         case 3:
            bc.a.drawImage(a[2], 1, 36, 0);
         }

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
         this.b.a(bc.a, var1.a, gg.p + (var2 != null ? this.a : 0), var3, 20);
         bc.a.setClip(var4, var5, var6, var7);
         var3 += this.b.a();
      } else {
         this.a.a(bc.a, var1.a, gg.p + (var2 != null ? this.a : 0), var3, 20);
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

      String var10;
      if ((var10 = var1.b()) != null) {
         var5 = bc.a.getClipX();
         var6 = bc.a.getClipY();
         var7 = bc.a.getClipWidth();
         int var9 = bc.a.getClipHeight();
         bc.a.clipRect(gg.p + (var2 != null ? this.a : 0), this.u - this.d.a() - this.y - 10, this.t - 20 - gg.p - this.a, this.u);
         boolean var10000 = this.e;
         if (!this.e) {
            this.c.a(bc.a, var10, gg.p + (var2 != null ? this.a : 0), this.u - this.d.a() - this.y - 10, 20);
         }

         bc.a.setClip(var5, var6, var7, var9);
      }

      if (this.e || this.k) {
         super.a();
      }

   }

   static {
      (a = new Image[3])[0] = gi.a(11);
      a[1] = gi.a(12);
      a[2] = gi.a(13);
   }
}
