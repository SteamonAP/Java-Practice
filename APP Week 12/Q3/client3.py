import socket

#to run type python client3.py

def start_client():
    server_host = '192.168.56.1'
    server_port = 12345

    client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

    message = "UDP Message"
    client_socket.sendto(message.encode('utf-8'), (server_host, server_port))

    response, server_address = client_socket.recvfrom(1024)
    print(f"Received response from server: {response.decode('utf-8')}")

if __name__ == "__main__":
    start_client()
