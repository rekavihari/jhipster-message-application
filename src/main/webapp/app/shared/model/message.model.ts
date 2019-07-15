export interface IMessage {
  id?: number;
  sender?: string;
  recipient?: string;
  topic?: string;
  imageContentType?: string;
  image?: any;
  imageURL?: string;
  latitude?: number;
  longitude?: number;
}

export class Message implements IMessage {
  constructor(
    public id?: number,
    public sender?: string,
    public recipient?: string,
    public topic?: string,
    public imageContentType?: string,
    public image?: any,
    public imageURL?: string,
    public latitude?: number,
    public longitude?: number
  ) {}
}
