FROM openjdk:11
RUN mkdir /app
COPY ./compiled /app
WORKDIR /app
CMD java Main