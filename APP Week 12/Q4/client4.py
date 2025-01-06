
#to run type python client.py
import socket
import random

def start_client():
    server_host = '192.168.56.1'
    server_port = 12345

    client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

    random_number = random.randint(1, 100)
    print(f"Sending random number: {random_number}")
    client_socket.sendto(str(random_number).encode('utf-8'), (server_host, server_port))

    response, server_address = client_socket.recvfrom(1024)
    result = response.decode('utf-8')
    print(f"Received result from server: {result}")

if __name__ == "__main__":
    start_client()
