����   A `
      java/lang/Object <init> ()V  -Implementacion/diccionariosMultiplesEstaticos
  
     inicializarDiccionario
     agregar (II)Z	      java/lang/System out Ljava/io/PrintStream;  	
Claves: 
      java/io/PrintStream println (Ljava/lang/String;)V
    ! " claves ()[I   $ % & makeConcatWithConstants (I)Ljava/lang/String;
  ( )  print + 
Valores para la clave 1: 
  - . / 	recuperar (I)[I
  1 2  eliminarValor 4 2
Valores para la clave 1 después de eliminar 10: 
  6 7 8 eliminar (I)Z : )
Claves después de eliminar la clave 2:  < Main Code LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V clave I valor args [Ljava/lang/String; diccionario /LImplementacion/diccionariosMultiplesEstaticos; StackMapTable H N [I 
SourceFile 	Main.java BootstrapMethods S   U
 V W X % Y $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses \ %java/lang/invoke/MethodHandles$Lookup ^ java/lang/invoke/MethodHandles Lookup ! ;           =   /     *� �    >        ?        @ A   	 B C  =  �     �� Y� 	L+� 
+
� W+� W+� W� � +� M,�>6� ,.6� � #  � '���� *� +� ,M,�>6� ,.6� � #  � '����+
� 0W� 3� +� ,M,�>6� ,.6� � #  � '����+� 5W� 9� +� M,�>6� ,.6� � #  � '����    >   b            	 $  ,  C  P  V  ^  v  �  �  �  �  �  �  �  �  �  �  �  �   ?   >  C  D E  v  F E  �  F E  �  D E    � G H    � I J  K   8 � 7  L  M  � �  M� �  M� �  M�   O    P Q     T  R Z   
  [ ] _ 