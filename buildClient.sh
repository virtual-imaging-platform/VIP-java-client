#!/bin/sh

OUTDIR=client2
rm -r $OUTDIR; mkdir $OUTDIR
java -jar swagger-codegen-cli.jar generate \
	-i swagger.yaml \
	-l java \
	-o $OUTDIR \
	-c ./config.json
