import socket
#change directory in terminal by cd "C:\Users\SANKHA\SELF PROJECTS\PYTHON PROGRAM\Week 12\Q1"
#to run type python client.py

def start_client():
    server_host = '192.168.56.1'
    server_port = 12345

    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect((server_host, server_port))

    message = "Hello, Server!"
    client_socket.send(message.encode('utf-8'))

    data = client_socket.recv(1024)
    print(f"Received: {data.decode('utf-8')}")

    client_socket.close()

if __name__ == "__main__":
    start_client()
