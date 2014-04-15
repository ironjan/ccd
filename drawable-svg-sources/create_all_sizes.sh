#!/bin/bash
RESDIR=../src/main/res
for i in *png;do 
 convert $i -resize 36x36 $RESDIR/drawable-ldpi/$i; 
 convert $i -resize 48x48 $RESDIR/drawable-mdpi/$i; 
 convert $i -resize 72x72 $RESDIR/drawable-hdpi/$i; 
 convert $i -resize 96x96 $RESDIR/drawable-xhdpi/$i; 
done
