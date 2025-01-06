import socket
import pickle
#change directory in terminal by cd "D:\Java Programs\APP Week 12\Q2"
#to run type python client.py

def start_client():
    server_host = '192.168.56.1'
    server_port = 12345

    client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client_socket.connect((server_host, server_port))

    numbers = [1, 2, 3, 4, 5]  

    data = pickle.dumps(numbers)
    client_socket.send(data)

    result_data = client_socket.recv(1024)
    result = result_data.decode('utf-8')

    print(f"Received result from server: {result}")

    client_socket.close()

if __name__ == "__main__":
    start_client()
