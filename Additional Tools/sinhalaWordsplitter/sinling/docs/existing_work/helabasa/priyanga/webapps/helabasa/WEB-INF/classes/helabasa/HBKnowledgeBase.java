 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   h e l a b a s a . u t i l s . H B D a t a b a s e ;  
  
 i m p o r t   j a v a . s q l . C o n n e c t i o n ;  
 i m p o r t   j a v a . s q l . R e s u l t S e t ;  
 i m p o r t   j a v a . s q l . S t a t e m e n t ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   o r g . o m g . C o s N a m i n g . I s t r i n g H e l p e r ;  
  
  
 p u b l i c   c l a s s   H B K n o w l e d g e B a s e   e x t e n d s   H B D a t a b a s e   {  
  
 	 p u b l i c   s t a t i c   f i n a l   i n t   S T A T U S _ U N K O W N   =   0 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   S T A T U S _ C O N F I R M E D   =   1 ;    
 	 p u b l i c   s t a t i c   f i n a l   i n t   S T A T U S _ O V E R W R I T T E N   =   2 ;    
 	  
 	 p u b l i c   H B K n o w l e d g e B a s e ( )    
 	 {  
  
 	 }  
  
 	 p u b l i c   s t a t i c   l o n g   G e t L e m m a I D ( S t r i n g   s L e m m a ,   s h o r t   i T y p e ,   s h o r t   i S u b T y p e )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 l o n g   l I D   =   G e t L e m m a I D ( o C o n ,   s L e m m a ,   i T y p e ,   i S u b T y p e ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   l I D ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 	 r e t u r n   0 ; 	 	  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   l o n g   R e g i s t e r L e m m a ( S t r i n g   s L e m m a ,   s h o r t   i T y p e ,   s h o r t   i S u b T y p e )  
 	 {  
 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " R e g i s t e r L e m m a   :   "   +   s L e m m a ) ;  
 	 	  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " R e g i s t e r L e m m a   :   C o n n e c t e d " ) ;  
 	 	 	  
 	 	 	 l o n g   l I D   =   R e g i s t e r L e m m a ( o C o n ,   s L e m m a ,   i T y p e ,   i S u b T y p e ) ;  
 	 	 	  
 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " R e g i s t e r L e m m a   :   I D = "   +   l I D ) ; 	 	 	  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   l I D ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 {  
 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " R e g i s t e r L e m m a   :   C o n n e c t i o n   F a i l e d " ) ;  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   l o n g   C o n f i r m L e m m a I D ( S t r i n g   s L e m m a ,   s h o r t   i T y p e ,   s h o r t   i S u b T y p e )  
 	 {  
 	 	 i f ( s L e m m a ! = n u l l   & &   s L e m m a . l e n g t h ( ) > 0 )  
 	 	 {  
 	 	 	 l o n g   i L e m m a I D   =   H B K n o w l e d g e B a s e . G e t L e m m a I D ( s L e m m a ,   i T y p e ,   i S u b T y p e ) ;  
 	 	 	  
 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " L e m m a   E x i s t s ?   :   "   +   i L e m m a I D ) ;  
 	 	 	  
 	 	 	 i f ( i L e m m a I D   < =   0 )  
 	 	 	 {  
 	 	 	 	 i L e m m a I D   =   H B K n o w l e d g e B a s e . R e g i s t e r L e m m a ( s L e m m a ,   i T y p e ,   i S u b T y p e ) ;  
 	 	 	 	  
 	 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " L e m m a   C r e a t e d   :   "   +   i L e m m a I D ) ;  
 	 	 	 }  
 	 	 	 r e t u r n   i L e m m a I D ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " L e m m a   N U L L " ) ;  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   s t a t i c   b o o l e a n   C o n f i r m M o r p h i n g ( S t r i n g   s L e m m a ,     s h o r t   i L e m m a T y p e ,   s h o r t   i L e m m a S u b T y p e ,   s h o r t   i R u l e S e t I D ,   s h o r t   i U s e r I D )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	  
 	 	 l o n g   i I D   =   G e t L e m m a I D ( s L e m m a ,   i L e m m a T y p e ,   i L e m m a S u b T y p e ) ;  
 	 	 i f ( i I D = = 0 )  
 	 	 {  
 	 	 	 i I D   =   R e g i s t e r L e m m a ( s L e m m a ,   i L e m m a T y p e ,   i L e m m a S u b T y p e ) ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 b o o l e a n   b R e s u l t   =   C o n f i r m M o r p h i n g ( o C o n ,   i I D ,   i L e m m a T y p e ,   i L e m m a S u b T y p e ,   i R u l e S e t I D ,   i U s e r I D ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   b R e s u l t ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 	 r e t u r n   f a l s e ; 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c     b o o l e a n   C o n f i r m M o r p h i n g ( l o n g   i L e m m a I D ,     s h o r t   i L e m m a T y p e ,   s h o r t   i L e m m a S u b T y p e ,   s h o r t   i R u l e S e t I D ,   s h o r t   i U s e r I D )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 b o o l e a n   b R e s u l t   =   C o n f i r m M o r p h i n g ( o C o n ,   i L e m m a I D ,   i L e m m a T y p e ,   i L e m m a S u b T y p e ,   i R u l e S e t I D ,   i U s e r I D ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   b R e s u l t ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 	 r e t u r n   f a l s e ; 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c     b o o l e a n   A d d E x c e p t i o n ( l o n g   i L e m m a I D ,   s h o r t   i F o r m T y p e ,   s h o r t   i F o r m S u b T y p e ,   S t r i n g   s W o r d ,   s h o r t   i U s e r I D )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 b o o l e a n   b R e s u l t   =   A d d E x c e p t i o n ( o C o n ,   i L e m m a I D ,   i F o r m T y p e ,   i F o r m S u b T y p e ,   s W o r d ,   i U s e r I D ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   b R e s u l t ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 	 r e t u r n   f a l s e ; 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   s h o r t   G e t M o r p h R u l e I D ( l o n g   i L e m m a I D ,   s h o r t   i T y p e , s h o r t   i S u b T y p e )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 s h o r t   i R u l e I D   =   G e t M o r p h R u l e I D ( o C o n ,   i L e m m a I D ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   i R u l e I D ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 	 r e t u r n   0 ; 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   s h o r t   G e t M o r p h R u l e I D ( S t r i n g   s L e m m a I D ,   s h o r t   i T y p e , s h o r t   i S u b T y p e )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	  
 	 	 l o n g   i L e m m a I D   =   G e t L e m m a I D ( s L e m m a I D ,   i T y p e ,   i S u b T y p e ) ;  
 	 	 i f ( i L e m m a I D   > =   0 )  
 	 	 {  
 	 	 	 r e t u r n   G e t M o r p h R u l e I D ( i L e m m a I D ,   i T y p e ,   i S u b T y p e ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 	 r e t u r n   0 ; 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   b o o l e a n   G e t E x c e p t i o n s ( l o n g   i L e m m a I D ,   L i s t < H B I r r e g u l a r F o r m >   l i s t F o r m s )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 b o o l e a n   b R e s u l t   =   G e t E x c e p t i o n s ( o C o n ,   i L e m m a I D ,   l i s t F o r m s ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   b R e s u l t ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 	 r e t u r n   f a l s e ; 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B L e m m a   I d e n t i f y L e m m a ( S t r i n g   s L e m m a ,   s h o r t   i T y p e ,   s h o r t   i S u b T y p e )  
 	 {  
 	 	 l o n g   i L e m m a I D   =   G e t L e m m a I D ( s L e m m a ,   i T y p e ,   i S u b T y p e ) ;  
 	 	  
 	 	 i f ( i L e m m a I D > 0 )  
 	 	 {  
 	 	 	 s h o r t   i M o r p h R u l e   =   G e t M o r p h R u l e I D ( i L e m m a I D ,   i T y p e ,   i S u b T y p e ) ;  
 	 	 	 L i s t < H B I r r e g u l a r F o r m >   l i s t F o r m s   =   n e w   A r r a y L i s t < H B I r r e g u l a r F o r m > ( ) ;  
 	 	 	 G e t E x c e p t i o n s ( i L e m m a I D ,   l i s t F o r m s ) ;  
 	 	 	 H B L e m m a   o L e m m a   =   n e w   H B L e m m a ( i L e m m a I D ,   i T y p e ,   i S u b T y p e ,   s L e m m a ) ;  
 	 	 	 o L e m m a . S e t M o r p h R u l e I D ( i M o r p h R u l e ) ;  
 	 	 	 o L e m m a . S e t E x c e p t i o n s ( l i s t F o r m s ) ;  
 	 	 	 r e t u r n   o L e m m a ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B L e m m a   G e t L e m m a ( l o n g   i I D )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 H B L e m m a   o L e m m a   =   G e t L e m m a ( o C o n ,   i I D ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   o L e m m a ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 	 r e t u r n   n u l l ; 	  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   H B L e m m a   S e a r c h L e m m a ( S t r i n g   s L e m m a )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 H B L e m m a   o L e m m a   =   G e t L e m m a ( o C o n ,   s L e m m a ) ; 	 	 	 	 	 	  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   o L e m m a ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 	 r e t u r n   n u l l ; 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B F o r m   S e a r c h E x c e p t i o n ( S t r i n g   s F o r m )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   n u l l ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 H B F o r m   o F o r m   =   G e t E x c e p t i o n ( o C o n ,   s F o r m ) ; 	 	 	 	 	 	  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   o F o r m ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 	 r e t u r n   n u l l ; 	  
 	 }  
 	 	  
 	 p u b l i c   s t a t i c   L i s t < H B L e m m a >   G e t L e m m a L i s t ( l o n g   i F r o m I D ,   l o n g   i T o I D )  
 	 {  
 	 	 L i s t < H B L e m m a >   l i s t L e m m a s   =   n e w   A r r a y L i s t < H B L e m m a > ( ) ;  
 	 	 f o r ( l o n g   i   =   i F r o m I D ;   i < i T o I D ;   i + + )  
 	 	 {  
 	 	 	 H B L e m m a   o L e m m a   =   G e t L e m m a ( i ) ;  
 	 	 	 i f ( o L e m m a ! = n u l l )  
 	 	 	 {  
 	 	 	 	 s h o r t   i M o r p h R u l e   =   G e t M o r p h R u l e I D ( o L e m m a . G e t I D ( ) ,   o L e m m a . G e t T y p e ( ) ,   o L e m m a . G e t S u b T y p e ( ) ) ;  
 	 	 	 	 L i s t < H B I r r e g u l a r F o r m >   l i s t F o r m s   =   n e w   A r r a y L i s t < H B I r r e g u l a r F o r m > ( ) ;  
 	 	 	 	 G e t E x c e p t i o n s ( o L e m m a . G e t I D ( ) ,   l i s t F o r m s ) ;  
 	 	 	 	  
 	 	 	 	 o L e m m a . S e t M o r p h R u l e I D ( i M o r p h R u l e ) ;  
 	 	 	 	 o L e m m a . S e t E x c e p t i o n s ( l i s t F o r m s ) ;  
 	 	 	 	  
 	 	 	 	 l i s t L e m m a s . a d d ( o L e m m a ) ;  
 	 	 	 } 	  
 	 	 }  
 	 	 r e t u r n   l i s t L e m m a s ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   l o n g   G e t M a x L e m m a I D ( )  
 	 {  
 	 	 i f ( b _ O f f l i n e )  
 	 	 { 	 	 	  
 	 	 	 r e t u r n   0 ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   C o n n e c t T o D B ( ) ;  
 	 	 i f ( o C o n ! = n u l l )  
 	 	 {  
 	 	 	 l o n g   l I D   =   G e t M a x L e m m a I D ( o C o n ) ;  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   l I D ;  
 	 	 } 	  
 	 	 e l s e    
 	 	 	 r e t u r n   0 ; 	  
 	 }  
 	  
 	  
 	 p r i v a t e   s t a t i c   l o n g   G e t M a x L e m m a I D ( C o n n e c t i o n   o C o n )  
 	 {  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   m a x ( l e m m a _ i d )   f r o m   h b _ l e m m a " ; 	 	  
 	 	  
 	 	 R e s u l t S e t   o R S   =   n u l l ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 l o n g   i I D   =   o R S . g e t L o n g ( 1 ) ; 	 	 	 	  
 	 	 	 	 r e t u r n   i I D ;  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   G e t   M a x   L e m m a   I D   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   0 ; 	  
 	 }  
 	  
 	 p r i v a t e   s t a t i c   H B L e m m a   G e t L e m m a ( C o n n e c t i o n   o C o n ,   l o n g   i I D )  
 	 { 	 	  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   l e m m a ,   l e m m a _ t y p e ,   l e m m a _ s u b _ t y p e ,   u . u s e r _ n a m e   f r o m   h b _ l e m m a   l ,   h b _ m o r p h _ c o n f i r m a t i o n s   c ,   h b _ u s e r s   u   w h e r e   l . l e m m a _ i d = c . l e m m a _ i d   a n d   c . u s e r _ i d = u . u s e r _ i d   a n d   l . l e m m a _ i d = "   +   i I D ; 	 	  
 	 	  
 	 	 R e s u l t S e t   o R S   =   n u l l ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	 	  
 	 	 	 	 S t r i n g   s L e m m a   =   o R S . g e t S t r i n g ( " l e m m a " ) ;  
 	 	 	 	 s h o r t   i T y p e   =   o R S . g e t S h o r t ( " l e m m a _ t y p e " ) ;  
 	 	 	 	 s h o r t   i S u b T y p e   =   o R S . g e t S h o r t ( " l e m m a _ s u b _ t y p e " ) ;  
 	 	 	 	 S t r i n g   s U s e r I D   =   o R S . g e t S t r i n g ( " u . u s e r _ n a m e " ) ;  
 	 	 	 	 H B L e m m a   o L e m m a   =   n e w   H B L e m m a ( i I D , i T y p e ,   i S u b T y p e ,   s L e m m a ) ;  
 	 	 	 	 o L e m m a . S e t C o n f i r m e d U s e r ( s U s e r I D ) ;  
 	 	 	 	 r e t u r n   o L e m m a ;  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   G e t   L e m m a   [ "   +   i I D   +   " ]   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	 	  
 	 p r i v a t e   s t a t i c   H B L e m m a   G e t L e m m a ( C o n n e c t i o n   o C o n ,   S t r i n g   s L e m m a )  
 	 { 	 	  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   l e m m a _ i d ,   l e m m a _ t y p e ,   l e m m a _ s u b _ t y p e   f r o m   h b _ l e m m a   l   w h e r e   l . l e m m a = ' "   +   s L e m m a   +   " ' " ; 	 	  
 	 	  
 	 	 R e s u l t S e t   o R S   =   n u l l ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	 	  
 	 	 	 	 l o n g     i L e m m a I D   =   o R S . g e t L o n g ( " l e m m a _ i d " ) ;  
 	 	 	 	 s h o r t   i T y p e   =   o R S . g e t S h o r t ( " l e m m a _ t y p e " ) ;  
 	 	 	 	 s h o r t   i S u b T y p e   =   o R S . g e t S h o r t ( " l e m m a _ s u b _ t y p e " ) ; 	 	 	 	  
 	 	 	 	 H B L e m m a   o L e m m a   =   n e w   H B L e m m a ( i L e m m a I D ,   i T y p e ,   i S u b T y p e ,   s L e m m a ) ; 	 	 	 	  
 	 	 	 	 r e t u r n   o L e m m a ;  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   G e t   L e m m a   [ "   +   s L e m m a   +   " ]   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   n u l l ;  
 	 }  
 	  
 	 p r i v a t e   s t a t i c   l o n g   G e t L e m m a I D ( C o n n e c t i o n   o C o n ,   S t r i n g   s L e m m a ,   s h o r t   i T y p e ,   s h o r t   i S u b T y p e )  
 	 { 	 	  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   l e m m a _ i d   f r o m   h b _ l e m m a   w h e r e   l e m m a = ' "   +   s L e m m a   +   " '   a n d   l e m m a _ t y p e = "   +   i T y p e   +   "   a n d   l e m m a _ s u b _ t y p e = "   +   i S u b T y p e ; 	 	  
 	 	  
 	 	 R e s u l t S e t   o R S   =   n u l l ;  
 	 	  
 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e t L e m m a I D   :   "   +   s S Q L ) ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 l o n g   i I D   =   o R S . g e t L o n g ( " l e m m a _ i d " ) ;  
 	 	 	 	  
 	 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e t L e m m a I D   :   F o u n d   :   "   +   i I D ) ;  
 	 	 	 	  
 	 	 	 	 r e t u r n   i I D ;  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   G e t   L e m m a   I D   o f   L e m m a   [ "   +   s L e m m a   +   " ]   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " G e t L e m m a I D   :   N o t   F o u n d ! "   ) ;  
 	 	  
 	 	 r e t u r n   0 ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   l o n g   R e g i s t e r L e m m a ( C o n n e c t i o n   o C o n ,   S t r i n g   s L e m m a ,   s h o r t   i T y p e ,   s h o r t   i S u b T y p e )  
 	 {  
 	 	 S t r i n g   s S Q L   =   " i n s e r t   i n t o   h b _ l e m m a ( l e m m a ,   l e m m a _ t y p e ,   l e m m a _ s u b _ t y p e )   "   +  
 	 	 	 	 " v a l u e s ( ' " +   s L e m m a   +   " ' ,   "   +   i T y p e   +   " ,   "   +   i S u b T y p e   +   " ) " ;  
 	 	  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " E x e c u t i n g   :   "   +   s S Q L ) ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 i f ( s Q u e r y . e x e c u t e ( s S Q L ) )  
 	 	 	 { 	  
 	 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " E x e c u t i n g   :   "   +   s S Q L ) ;  
 	 	 	 	 / / r e t u r n     G e t L e m m a I D ( o C o n ,   s L e m m a ,   i T y p e ,   i S u b T y p e ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 / / H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " E x e c u t i o n   F a i l e d   :   "   +   s Q u e r y . t o S t r i n g ( ) ) ;  
 	 	 	 }  
 	 	 	  
 	 	 	 r e t u r n     G e t L e m m a I D ( o C o n ,   s L e m m a ,   i T y p e ,   i S u b T y p e ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   R e g i s t e r i n g   L e m m a   [ "   +   s L e m m a   +   " ]   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   0 ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   b o o l e a n   C o n f i r m M o r p h i n g ( C o n n e c t i o n   o C o n ,   l o n g   i L e m m a I D ,   s h o r t   i L e m m a T y p e ,   s h o r t   i L e m m a S u b T y p e ,   s h o r t   i R u l e S e t I D ,   s h o r t   i U s e r I D )  
 	 {  
 	 	 s h o r t   i M o r p h R u l e I D   =   G e t M o r p h R u l e I D ( o C o n ,   i L e m m a I D ) ;  
 	 	  
 	 	 i f ( i M o r p h R u l e I D > 0 )  
 	 	 { 	 	 	  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   C o n f i r m   M o r p h i n g     :   A   M o r p h   R u l e   A l r e a d y   E x i s t s   f o r   L e m m a   [ "   +   i L e m m a I D   +   " ]   a s   [ "   +   i R u l e S e t I D   +   " ] " ) ;  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 }  
 	 	  
 	 	 S t r i n g   s S Q L   =   " i n s e r t   i n t o   h b _ m o r p h _ c o n f i r m a t i o n s ( l e m m a _ i d ,   r u l e _ s e t _ i d ,   u s e r _ i d )   "   +  
 	 	 	 	 " v a l u e s ( ' " +   i L e m m a I D   +   " ' ,   "   +   i R u l e S e t I D   +   " ,   "   +   i U s e r I D   +   " ) " ; 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 i f ( s Q u e r y . e x e c u t e ( s S Q L ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n     t r u e ;  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :     C o n f i r m   M o r p h i n g   f o r   L e m m a   [ "   +   i L e m m a I D   +   " ]   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   f a l s e ;  
 	 }  
  
  
  
 	  
 	 p u b l i c   s t a t i c   b o o l e a n   A d d E x c e p t i o n ( C o n n e c t i o n   o C o n ,   l o n g   i L e m m a I D ,   s h o r t   i F o r m T y p e ,   s h o r t   i F o r m S u b T y p e ,   S t r i n g   s W o r d ,   s h o r t   i U s e r I D )  
 	 {  
 	 	 S t r i n g   s S Q L   =   " i n s e r t   i n t o   h b _ e x c e p t i o n s ( l e m m a _ i d ,   f o r m _ t y p e ,   f o r m _ s u b _ t y p e ,   w o r d ,   u s e r _ i d )   "   +  
 	 	 	 	 " v a l u e s ( " +   i L e m m a I D   +   " ,   "   +   i F o r m T y p e   +   " ,   "   +   i F o r m S u b T y p e   +   " ,   ' "   +   s W o r d   +   " '   , "   +   i U s e r I D   +   " ) " ; 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 i f ( s Q u e r y . e x e c u t e ( s S Q L ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n     t r u e ;  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :     A d d E x c e p t i o n   f o r   L e m m a   [ "   +   i L e m m a I D   +   " ]   a s   [ "   +   s W o r d   +   " ]   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   f a l s e ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   s h o r t   G e t M o r p h R u l e I D ( C o n n e c t i o n   o C o n ,   l o n g   i L e m m a I D )  
 	 {  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   r u l e _ s e t _ i d   f r o m   h b _ m o r p h _ c o n f i r m a t i o n s   w h e r e   l e m m a _ i d = ' "   +   i L e m m a I D   +   " ' " ; 	 	  
 	 	  
 	 	 R e s u l t S e t   o R S   =   n u l l ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 s h o r t   i R u l e I D   =   o R S . g e t S h o r t ( " r u l e _ s e t _ i d " ) ; 	 	 	 	  
 	 	 	 	 r e t u r n   i R u l e I D ;  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   G e t   M o r p h   R u l e   I D   o f   L e m m a   [ "   +   i L e m m a I D   +   " ]   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 	  
 	 	 r e t u r n   0 ;  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   b o o l e a n   G e t E x c e p t i o n s ( C o n n e c t i o n   o C o n ,   l o n g   i L e m m a I D ,   L i s t < H B I r r e g u l a r F o r m >   l i s t F o r m s )  
 	 {  
 	 	  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   f o r m _ t y p e ,   f o r m _ s u b _ t y p e ,   w o r d   f r o m   h b _ e x c e p t i o n s   "   +  
 	 	 	 	 " w h e r e   l e m m a _ i d = " +   i L e m m a I D ; 	 	  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 R e s u l t S e t   o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	 	 	 	 	 	 	 	  
 	 	 	 	 s h o r t   i T y p e   =   o R S . g e t S h o r t ( " f o r m _ t y p e " ) ;  
 	 	 	 	 s h o r t   i S u b T y p e   =   o R S . g e t S h o r t ( " f o r m _ s u b _ t y p e " ) ;  
 	 	 	 	 S t r i n g   s W o r d   =   o R S . g e t S t r i n g ( " w o r d " ) ;  
 	 	 	 	  
 	 	 	 	 H B I r r e g u l a r F o r m   o F o r m   =   n e w   H B I r r e g u l a r F o r m ( s W o r d ,   i T y p e ,   i S u b T y p e ) ;  
 	 	 	 	  
 	 	 	 	 l i s t F o r m s . a d d ( o F o r m ) ;  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ; 	  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   G e t E x c e p t i o n s   f o r   L e m m a   [ "   +   i L e m m a I D   +   " ]   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	 	  
 	 	 	 	  
 	 	 r e t u r n   f a l s e ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   H B F o r m   G e t E x c e p t i o n ( C o n n e c t i o n   o C o n ,   S t r i n g   s F o r m )  
 	 {  
 	 	 H B I r r e g u l a r F o r m   o F o r m   =   n u l l ;  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   l e m m a _ i d ,   f o r m _ t y p e ,   f o r m _ s u b _ t y p e ,   w o r d   f r o m   h b _ e x c e p t i o n s   w h e r e   w o r d = ' "   +   s F o r m   +   " ' " ; 	  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 R e s u l t S e t   o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	 	  
 	 	 	 	 l o n g   i L e m m a I D   =   o R S . g e t L o n g ( " l e m m a _ i d " ) ;  
 	 	 	 	 s h o r t   i T y p e   =   o R S . g e t S h o r t ( " f o r m _ t y p e " ) ;  
 	 	 	 	 s h o r t   i S u b T y p e   =   o R S . g e t S h o r t ( " f o r m _ s u b _ t y p e " ) ;  
 	 	 	 	 S t r i n g   s W o r d   =   o R S . g e t S t r i n g ( " w o r d " ) ;  
 	 	 	 	  
 	 	 	 	 o F o r m   =   n e w   H B I r r e g u l a r F o r m ( s W o r d ,   i T y p e ,   i S u b T y p e ) ; 	 	 	 	  
 	 	 	 	 H B L e m m a   o L e m m a   =   G e t L e m m a ( o C o n ,   i L e m m a I D ) ; 	 	 	 	  
 	 	 	 	 o F o r m . S e t L e m m a ( o L e m m a ) ; 	 	 	 	  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ; 	  
 	 	 	 D i s c o n n e c t F r o m D B ( o C o n ) ;  
 	 	 	 r e t u r n   o F o r m ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   G e t E x c e p t i o n   f o r   W o r d   [ "   +   s F o r m   +   " ]   f a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	 	  
 	 	 	 	  
 	 	 r e t u r n   o F o r m ;  
 	 } 	  
 }  
  
