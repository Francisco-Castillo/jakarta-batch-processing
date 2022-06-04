FROM payara/server-full
MAINTAINER Francisco Castillo
COPY ./target/jakarta-batch-processing.war $DEPLOY_DIR
