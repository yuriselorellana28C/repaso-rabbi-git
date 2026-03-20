package com.bank.producer;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class App {

    private static final String[] BANCOS = {"BAC", "BANRURAL", "BI", "GYT"};

    public static void main(String[] args) {
        try {
            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("localhost");
            factory.setUsername("guest");
            factory.setPassword("guest");

            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            String mensaje = "Mensaje modificado desde examen";
            System.out.println("producer ejecutandose correctamente");

            for (String banco : BANCOS) {
                channel.queueDeclare(banco, false, false, false, null);
                channel.basicPublish("", banco, null, mensaje.getBytes("UTF-8"));
                System.out.println("Mensaje enviado al banco: " + banco);
            }

            channel.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}